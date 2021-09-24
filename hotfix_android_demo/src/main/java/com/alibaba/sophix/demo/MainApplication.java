package com.alibaba.sophix.demo;

import android.app.Activity;
import android.app.Application;
import android.util.Log;

import com.blankj.utilcode.util.AppUtils;
import com.blankj.utilcode.util.Utils;

/**
 * User: xingzhi.wap
 * Date:16/5/17
 */
public class MainApplication extends Application {

    private static final String TAG = MainApplication.class.getSimpleName();

    @Override
    public void onCreate() {
        super.onCreate();

        Log.i(TAG, "原有的Application，可以通过补丁修改");

        AppUtils.registerAppStatusChangedListener(new Utils.OnAppStatusChangedListener() {
            @Override
            public void onForeground(final Activity activity) {

            }

            @Override
            public void onBackground(final Activity activity) {
                if (SophixStubApplication.isNeedRestart) {
                    android.os.Process.killProcess(android.os.Process.myPid());
                }
            }
        });
    }

}
