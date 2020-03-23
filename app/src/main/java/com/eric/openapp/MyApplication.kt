package com.eric.openapp

import android.app.Application
import androidx.lifecycle.ProcessLifecycleOwner
import com.eric.commonlibrary.mgr.KtxApplifeObserver
import com.eric.commonlibrary.mgr.KtxLifeCycleCallBack

/**
 * @Author: chen
 * @datetime: 2020/3/24
 * @desc:
 */
class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        ProcessLifecycleOwner.get().lifecycle.addObserver(KtxApplifeObserver())

        this.registerActivityLifecycleCallbacks(KtxLifeCycleCallBack())
    }
}