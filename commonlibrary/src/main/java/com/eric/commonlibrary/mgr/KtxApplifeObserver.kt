package com.eric.commonlibrary.mgr

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

/**

 * @Author: chen

 * @datetime: 2020/3/24

 * @desc:

 */
class KtxApplifeObserver() : LifecycleObserver {

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun onForeground() {
        JLGLLog.i(TAG.CJX.name, "[onForeground]")

    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun onBackground() {
        JLGLLog.i(TAG.CJX.name, "[onBackground]")

    }
}