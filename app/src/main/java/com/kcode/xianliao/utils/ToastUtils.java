package com.kcode.xianliao.utils;

import android.widget.Toast;

import com.kcode.xianliao.app.App;

/**
 * Created by caik on 2017/3/1.
 */

public class ToastUtils {
    public static void show(int resId) {
        show(App.sContext.getResources().getString(resId));
    }

    public static void show(String resId) {
        Toast.makeText(App.sContext, resId, Toast.LENGTH_SHORT).show();
    }

}
