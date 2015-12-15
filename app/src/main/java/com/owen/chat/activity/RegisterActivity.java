package com.owen.chat.activity;

import android.content.Context;
import android.content.Intent;

/**
 * Created by mike on 15/12/15.
 */
public class RegisterActivity extends BaseActivity {

    public static void actionStart(Context context) {
        Intent intent = new Intent(context, RegisterActivity.class);
        context.startActivity(intent);
    }

}
