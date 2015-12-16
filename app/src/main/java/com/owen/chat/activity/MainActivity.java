package com.owen.chat.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import com.owen.chat.R;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.bmob.im.BmobChat;

/**
 * 主界面
 * <p/>
 * Created by mike on 15/12/15.
 */
public class MainActivity extends BaseActivity {

    @Bind(R.id.fragment_container)
    FrameLayout mFragmentContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        BmobChat.getInstance(this).startPollService(10);
    }

    public static void actionStart(Context context) {
        Intent intent = new Intent(context, MainActivity.class);
        context.startActivity(intent);
    }

    private static

    private int mCurrentTabIndex;

    @OnClick({R.id.btn_tab_message, R.id.btn_tab_contact, R.id.btn_tab_setting})
    public void onTabSelecte(View view) {
        switch (view.getId()) {
            case R.id.btn_tab_message:
                break;
            case R.id.btn_tab_contact:
                break;
            case R.id.btn_tab_setting:
                break;
            default:
                break;
        }
    }

}
