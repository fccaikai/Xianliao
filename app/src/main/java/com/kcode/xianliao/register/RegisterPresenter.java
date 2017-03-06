package com.kcode.xianliao.register;

import com.hyphenate.chat.EMClient;
import com.hyphenate.exceptions.HyphenateException;

/**
 * Created by caik on 2017/3/6.
 */

public class RegisterPresenter implements RegisterContract.Presenter {
    private RegisterContract.View mView;

    public RegisterPresenter(RegisterContract.View view) {
        mView = view;
        mView.setPresenter(this);
    }


    @Override
    public void register(final String username, final String pwd) {
        mView.showProgress();

        new Thread() {
            @Override
            public void run() {
                boolean success = true;
                try {
                    EMClient.getInstance().createAccount(username, pwd);//同步方法
                } catch (HyphenateException e) {
                    e.printStackTrace();
                    success = false;
                }finally {
                    mView.dismissProgress();

                    if (success) {
                        mView.registerSuccess();
                    }else {
                        mView.registerError();
                    }
                }
            }
        }.start();

    }
}
