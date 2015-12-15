package com.owen.chat.app;

import android.app.Application;

import com.owen.chat.config.Config;

import cn.bmob.im.BmobChat;

/**
 * Created by mike on 15/12/15.
 */
public class AppApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        BmobChat.DEBUG_MODE = true;
        BmobChat.getInstance(this).init(Config.APPLICATION_ID);
    }
}
