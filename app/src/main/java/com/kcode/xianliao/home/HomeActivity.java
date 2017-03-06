package com.kcode.xianliao.home;

import android.content.Context;
import android.content.Intent;

import com.kcode.xianliao.R;
import com.kcode.xianliao.app.BaseActivity;

/**
 * Created by caik on 2017/3/6.
 */

public class HomeActivity extends BaseActivity {

    public static Intent newIntent(Context context) {
        return new Intent(context, HomeActivity.class);
    }
    @Override
    protected int getLayoutView() {
        return R.layout.activity_home;
    }
}
