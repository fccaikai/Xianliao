package com.kcode.xianliao.register;

import android.content.Context;
import android.content.Intent;

import com.kcode.xianliao.R;
import com.kcode.xianliao.app.BaseActivity;

/**
 * Created by caik on 2017/3/1.
 */

public class RegisterActivity extends BaseActivity {

    public static Intent newIntent(Context context) {
        Intent intent = new Intent(context, RegisterActivity.class);
        return intent;
    }
    @Override
    protected int getLayoutView() {
        return R.layout.activity_register;
    }
}
