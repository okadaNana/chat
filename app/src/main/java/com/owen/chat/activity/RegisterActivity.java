package com.owen.chat.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.owen.chat.R;

/**
 * 注册页面
 * <p/>
 * Created by mike on 15/12/15.
 */
public class RegisterActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public static void actionStart(Context context) {
        Intent intent = new Intent(context, RegisterActivity.class);
        context.startActivity(intent);
    }

}
