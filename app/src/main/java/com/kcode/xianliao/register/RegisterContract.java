package com.kcode.xianliao.register;

import com.kcode.xianliao.BasePresenter;
import com.kcode.xianliao.BaseView;

/**
 * Created by caik on 2017/2/27.
 */

public interface RegisterContract {
    interface View extends BaseView<Presenter> {
        void showProgress();

        void dismissProgress();

        void registerSuccess();

        void registerError();
    }

    interface Presenter extends BasePresenter {
        void register(String username, String pwd);
    }

}
