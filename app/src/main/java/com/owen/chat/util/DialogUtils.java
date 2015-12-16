package com.owen.chat.util;

import android.app.ProgressDialog;
import android.content.Context;

/**
 * 窗口工具类
 *
 * Created by mike on 15/12/16.
 */
public class DialogUtils {

    public static ProgressDialog createProgressDialog(Context context, String message) {
        final ProgressDialog dialog = new ProgressDialog(context);

        dialog.setMessage(message);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);

        return dialog;
    }

}
