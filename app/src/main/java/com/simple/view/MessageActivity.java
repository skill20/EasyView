package com.simple.view;

import android.graphics.Color;
import android.os.Bundle;

import com.xcheng.view.EasyView;
import com.xcheng.view.controller.EasyActivity;

import es.dmoral.toasty.Toasty;

public class MessageActivity extends EasyActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ac_message);
        Toasty.Config.getInstance().setWarningColor(Color.RED).apply();
        Toasty.info(this, "测试一般信息", 1, false).show();
        EasyView.success("登录成功");
        findViewById(R.id.tv_uncheck).setEnabled(true);
    }

    @Override
    public int getLayoutId() {
        return 0;
    }
}
