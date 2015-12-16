package com.owen.chat.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import com.owen.chat.R;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 注册页
 * <p/>
 * Created by mike on 15/12/15.
 */
public class RegisterActivity extends BaseActivity {

    @Bind(R.id.edt_username)
    EditText mEdtUsername;
    @Bind(R.id.edt_password)
    EditText mEdtPassword;
    @Bind(R.id.edt_password_again)
    EditText mEdtPasswordAgain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_register)
    public void register() {
        
    }

    public static void actionStart(Context context) {
        Intent intent = new Intent(context, RegisterActivity.class);
        context.startActivity(intent);
    }

}
