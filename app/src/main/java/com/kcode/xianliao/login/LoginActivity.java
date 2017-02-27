package com.kcode.xianliao.login;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.kcode.xianliao.R;

public class LoginActivity extends AppCompatActivity implements LoginContract.View{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    @Override
    public void serPresenter(LoginContract.Presenter presenter) {

    }
}
