package com.kcode.xianliao.login;

import android.util.Log;

import com.hyphenate.EMCallBack;
import com.hyphenate.chat.EMClient;

/**
 * Created by caik on 2017/2/27.
 */

public class LoginPresenter  implements LoginContract.Presenter{

    private LoginContract.View mView;

    public LoginPresenter(LoginContract.View view) {
        mView = view;
        mView.setPresenter(this);
    }

    @Override
    public void login(String account, String password) {
        mView.showLoginProgress();

        EMClient.getInstance().login(account,password,new EMCallBack() {//回调
            @Override
            public void onSuccess() {
                loginFinish(true);
                Log.d("main", "登录聊天服务器成功！");
            }

            @Override
            public void onProgress(int progress, String status) {

            }

            @Override
            public void onError(int code, String message) {
                Log.d("main", "登录聊天服务器失败！");
                loginFinish(false);
            }
        });

    }

    private void loginFinish(boolean loginStatus) {
        mView.dismissLoginProgress();

    }
}
