package com.kcode.xianliao.login;

import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.widget.TextView;

import com.kcode.xianliao.R;
import com.kcode.xianliao.app.BaseActivity;

import butterknife.BindView;
import butterknife.OnClick;

public class LoginActivity extends BaseActivity implements LoginContract.View{

    @BindView(R.id.etAccount)
    TextInputEditText etAccount;

    @BindView(R.id.etPassword)
    TextInputEditText etPassword;

    @BindView(R.id.tvRegister)
    TextView tvRegister;

    private LoginPresenter mLoginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mLoginPresenter = new LoginPresenter(this);
    }

    @OnClick(R.id.btnLogin)
    public void login() {
        mLoginPresenter.login(etAccount.getText().toString(),etPassword.getText().toString());
    }

    @Override
    public void setPresenter(LoginContract.Presenter presenter) {

    }

    @Override
    public void showLoginProgress() {

    }

    @Override
    public void dismissLoginProgress() {

    }

    @Override
    public void showLoginStatus(boolean loginStatus, String message) {

    }
}
