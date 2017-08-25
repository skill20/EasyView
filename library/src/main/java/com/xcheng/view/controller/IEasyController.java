package com.xcheng.view.controller;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.StringRes;
import android.view.View;

/**
 * @author xincheng
 */
public interface IEasyController extends View.OnClickListener {
    /**
     * 获取布局Layout的id
     */
    @LayoutRes
    int getLayoutId();

    /**
     * 初始化传递过来的Bundle数据
     */
    void initData();

    /**
     * savedInstanceState If the activity is being re-initialized after
     * previously being shut down then this Bundle contains the data it most
     * recently supplied in {@link android.app.Activity#onSaveInstanceState(Bundle)}.  <b><i>Note: Otherwise it is null.</i></b>
     * 初始化View控件
     *
     * @param savedInstanceState 销毁保存参数
     */
    void initView(Bundle savedInstanceState);

    /**
     * 设置监听
     */
    void setListener();

    /**
     * 显示消息提醒等
     *
     * @param text 消息内容
     */
    void showMessage(CharSequence text);

    void showMessage(@StringRes int stringId);

    /**
     * 显示加载
     */
    void showLoading();

    /**
     * 隐藏加载
     */
    void hideLoading();

}