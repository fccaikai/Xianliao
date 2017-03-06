package com.kcode.xianliao.common;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kcode.xianliao.R;

/**
 * Created by caik on 2017/3/6.
 */

public class ProgressDialog extends DialogFragment {
    public static ProgressDialog newInstance() {

        Bundle args = new Bundle();

        ProgressDialog fragment = new ProgressDialog();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.common_progress, container, false);
    }
}
