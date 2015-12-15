package com.owen.chat.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import cn.bmob.im.BmobChatManager;
import cn.bmob.im.BmobUserManager;

/**
 * Created by mike on 15/12/15.
 */
public class BaseActivity extends AppCompatActivity {

    BmobUserManager mUserManager;
    BmobChatManager mChatManager;
    Toast mToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mUserManager = BmobUserManager.getInstance(this);
        mChatManager = BmobChatManager.getInstance(this);
    }

    protected void showToast(final int resId) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                if (mToast == null) {
                    mToast = Toast.makeText(getApplicationContext(), resId, Toast.LENGTH_SHORT);
                } else {
                    mToast.setText(resId);
                }
                mToast.show();;
            }
        });
    }

}
