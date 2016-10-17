package com.lxy.small;

import android.app.Application;

import net.wequick.small.Small;

/**
 * Created by C on 16/10/17.
 */

public class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Small.preSetUp(this);

        Small.setBaseUri("http://www.baidu.com/");// 浏览器跳转url
        Small.setUp(this, null);

    }
}
