package com.eric.commonlibrary.mgr

import android.app.Activity
import android.app.Application
import android.os.Bundle

/**

 * @Author: chen

 * @datetime: 2020/3/24

 * @desc:
 *
 *
 * 全局管理activity生命周期 类的单一职责

 */
class KtxLifeCycleCallBack() : Application.ActivityLifecycleCallbacks {

    override fun onActivityPaused(activity: Activity) {
        JLGLLog.i(TAG.CJX.name, "[onActivityPaused]")
    }

    override fun onActivityStarted(activity: Activity) {
        JLGLLog.i(TAG.CJX.name, "[onActivityStarted]")
    }

    override fun onActivityDestroyed(activity: Activity) {
        JLGLLog.i(TAG.CJX.name, "[onActivityDestroyed]")
    }

    override fun onActivitySaveInstanceState(activity: Activity, outState: Bundle) {
    }

    override fun onActivityStopped(activity: Activity) {
    }

    override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {
    }

    override fun onActivityResumed(activity: Activity) {
    }
}