package com.owen.chat.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.owen.chat.R;

/**
 * 登陆界面
 *
 * Created by mike on 15/12/15.
 */
public class LoginActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public static void actionStart(Context context) {
        Intent intent = new Intent(context, LoginActivity.class);
        context.startActivity(intent);
    }

}
