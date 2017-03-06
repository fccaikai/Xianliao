package com.kcode.xianliao.register;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;

import com.kcode.xianliao.R;
import com.kcode.xianliao.app.BaseActivity;

import butterknife.BindView;

/**
 * Created by caik on 2017/3/1.
 */

public class RegisterActivity extends BaseActivity implements RegisterContract.View{

    private static final String TAG = "RegisterActivity";

    public static Intent newIntent(Context context) {
        Intent intent = new Intent(context, RegisterActivity.class);
        return intent;
    }

    @BindView(R.id.etAccount)
    EditText etAccount;
    @BindView(R.id.etPassword)
    EditText etPassword;

    private RegisterPresenter mPresenter;

    @Override
    protected int getLayoutView() {
        return R.layout.activity_register;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setUpToolbar(R.id.toolbar,"注册");
        mPresenter = new RegisterPresenter(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.register_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.finish:
                register();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }

    private void register() {
        final String username = etAccount.getText().toString();
        if (TextUtils.isEmpty(username)) {
            return;
        }

        final String pwd = etPassword.getText().toString();
        if (TextUtils.isEmpty(pwd)){
            return;
        }

        mPresenter.register(username,pwd);
    }

    @Override
    public void showProgress() {
        showProgressDialog();
    }

    @Override
    public void dismissProgress() {
        dismissProgressDialog();
    }

    @Override
    public void registerSuccess() {
        Log.d(TAG, "registerSuccess");
    }

    @Override
    public void registerError() {
        Log.d(TAG, "registerError");
    }

    @Override
    public void setPresenter(RegisterContract.Presenter presenter) {

    }
}
