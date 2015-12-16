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
                    mToast = Toast.makeText(getApplicationContext(), resId, Toast.LENGTH_LONG);
                } else {
                    mToast.setText(resId);
                }
                mToast.show();;
            }
        });
    }

    protected void showToast(final String text) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                if (mToast == null) {
                    mToast = Toast.makeText(getApplicationContext(), text, Toast.LENGTH_LONG);
                } else {
                    mToast.setText(text);
                }
                mToast.show();;
            }
        });
    }

    /**
     * 用于登陆或者自动登陆情况下的用户资料及好友资料的检测更新
     */
    protected void updateUserInfo() {

    }

}
