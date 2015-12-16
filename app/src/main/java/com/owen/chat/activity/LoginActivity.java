package com.owen.chat.activity;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.widget.EditText;

import com.owen.chat.R;
import com.owen.chat.bean.User;
import com.owen.chat.util.CommonUtils;
import com.owen.chat.util.DialogUtils;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.bmob.v3.listener.SaveListener;

/**
 * 登陆界面
 * <p/>
 * Created by mike on 15/12/15.
 */
public class LoginActivity extends BaseActivity {

    @Bind(R.id.edt_username)
    EditText mEdtUsername;
    @Bind(R.id.edt_password)
    EditText mEdtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_login)
    public void login() {
        boolean isNetConnected = CommonUtils.isNetworkAvailable(this);
        if (!isNetConnected) {
            showToast(R.string.network_tips);
            return;
        }

        String username = mEdtUsername.getText().toString();
        String password = mEdtPassword.getText().toString();

        if (TextUtils.isEmpty(username)) {
<<<<<<< HEAD
            mEdtUsername.setError(getString(R.string.username_cannot_be_null));
        }
        if (TextUtils.isEmpty(password)) {
            mEdtPassword.setError(getString(R.string.password_cannot_be_null));
=======
            showToast(R.string.username_cannot_be_null);
            return;
        }
        if (TextUtils.isEmpty(password)) {
            showToast(R.string.password_cannot_be_null);
            return;
>>>>>>> a4debcfffd2c7257de263b8c605df30cedc4599a
        }

        final ProgressDialog progressDialog = DialogUtils.createProgressDialog(this, getString(R.string.on_loging));
        progressDialog.show();

        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        mUserManager.login(user, new SaveListener() {
            @Override
            public void onSuccess() {
                progressDialog.setMessage("登录成功");
                updateUserInfo();
                progressDialog.dismiss();
                MainActivity.actionStart(LoginActivity.this);
            }

            @Override
            public void onFailure(int errorCode, String msg) {
                progressDialog.dismiss();
<<<<<<< HEAD
=======
                BmobLog.i(msg);
                Log.d("Tag", "errorCode=" + errorCode + ",msg=" + msg);
>>>>>>> a4debcfffd2c7257de263b8c605df30cedc4599a
                showToast(R.string.username_or_password_error);
            }
        });
    }

    @OnClick(R.id.tv_register)
    public void register() {
        RegisterActivity.actionStart(this);
    }

    public static void actionStart(Context context) {
        Intent intent = new Intent(context, LoginActivity.class);
        context.startActivity(intent);
    }

}
