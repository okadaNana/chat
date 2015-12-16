package com.owen.chat.activity;

import android.os.Bundle;
import android.os.Handler;

import com.owen.chat.R;

/**
 * 启动页
 *
 * Created by mike on 15/12/15.
 */
public class SplashActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                LoginActivity.actionStart(SplashActivity.this);
                finish();
            }
        }, 2000);
    }
}
