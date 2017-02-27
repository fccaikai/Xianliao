package com.kcode.xianliao.login;

import com.kcode.xianliao.BasePresenter;
import com.kcode.xianliao.BaseView;

/**
 * Created by caik on 2017/2/27.
 */

public interface LoginContract {
    interface View extends BaseView<Presenter> {

    }

    interface Presenter extends BasePresenter {
    }

}
