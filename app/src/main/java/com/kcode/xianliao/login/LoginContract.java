package com.kcode.xianliao.login;

import com.kcode.xianliao.BasePresenter;
import com.kcode.xianliao.BaseView;

/**
 * Created by caik on 2017/2/27.
 */

public interface LoginContract {
    interface View extends BaseView<Presenter> {
        void showLoginProgress();

        void dismissLoginProgress();

        void showLoginStatus(boolean loginStatus,String message);
    }

    interface Presenter extends BasePresenter {
        void login(String account,String password);
    }

}
