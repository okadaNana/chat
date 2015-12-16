package com.owen.chat.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
<<<<<<< HEAD
import android.widget.EditText;

import com.owen.chat.R;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 注册页
=======

import com.owen.chat.R;

/**
 * 注册页面
>>>>>>> a4debcfffd2c7257de263b8c605df30cedc4599a
 * <p/>
 * Created by mike on 15/12/15.
 */
public class RegisterActivity extends BaseActivity {

<<<<<<< HEAD
    @Bind(R.id.edt_username)
    EditText mEdtUsername;
    @Bind(R.id.edt_password)
    EditText mEdtPassword;
    @Bind(R.id.edt_password_again)
    EditText mEdtPasswordAgain;

=======
>>>>>>> a4debcfffd2c7257de263b8c605df30cedc4599a
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
<<<<<<< HEAD
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_register)
    public void register() {
        
=======
>>>>>>> a4debcfffd2c7257de263b8c605df30cedc4599a
    }

    public static void actionStart(Context context) {
        Intent intent = new Intent(context, RegisterActivity.class);
        context.startActivity(intent);
    }

}
