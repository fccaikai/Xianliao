package com.kcode.xianliao.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.text.TextUtils;

import com.kcode.xianliao.R;
import com.kcode.xianliao.app.BaseActivity;
import com.kcode.xianliao.register.RegisterActivity;
import com.kcode.xianliao.utils.ToastUtils;

import butterknife.BindView;
import butterknife.OnClick;

public class LoginActivity extends BaseActivity implements LoginContract.View{

    @BindView(R.id.etAccount)
    TextInputEditText etAccount;

    @BindView(R.id.etPassword)
    TextInputEditText etPassword;

    private LoginPresenter mLoginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mLoginPresenter = new LoginPresenter(this);
    }

    @Override
    protected int getLayoutView() {
        return R.layout.activity_login;
    }

    @OnClick(R.id.btnLogin)
    public void login() {
        String account = etAccount.getText().toString();
        if (TextUtils.isEmpty(account)) {
            ToastUtils.show(R.string.account_empty_tip);
            return;
        }

        String password = etPassword.getText().toString();
        if (TextUtils.isEmpty(password)) {
            ToastUtils.show(R.string.password_empty_tip);
            return;
        }

        mLoginPresenter.login(account,password);
    }

    @OnClick(R.id.btnRegister)
    public void register() {
        Intent intent = RegisterActivity.newIntent(this);
        startActivity(intent);
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
