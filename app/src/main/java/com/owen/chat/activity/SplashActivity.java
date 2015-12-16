package com.owen.chat.activity;

import android.os.Bundle;
import android.os.Handler;

import com.owen.chat.R;

/**
 * 启动页
 * <p/>
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
<<<<<<< HEAD
                LoginActivity.actionStart(SplashActivity.this);
                finish();
=======
                if (mUserManager.getCurrentUser() != null) {
                    MainActivity.actionStart(SplashActivity.this);
                } else {
                    LoginActivity.actionStart(SplashActivity.this);
                }
>>>>>>> a4debcfffd2c7257de263b8c605df30cedc4599a
            }
        }, 2000);
    }
}
