package com.eric.commonlibrary.mgr

import timber.log.Timber

/**
 * Created by dawnxiao on 14-9-5.
 * 公用日志工具类
 */
object JLGLLog {
    private const val TAG = "JLGLLog"
    /**
     * VERBOSE格式化日志输出
     *
     * @param tagName
     * @param format
     * @param logMsg
     */
    fun v(
        tagName: String?,
        format: String?,
        vararg logMsg: Any?
    ) {
        Timber.tag(tagName).v(format, logMsg)
    }

    /**
     * DEBUG格式化日志输出
     *
     * @param tagName
     * @param format
     * @param logMsg
     */
    fun d(
        tagName: String?,
        format: String?,
        vararg logMsg: Any?
    ) {
        Timber.tag(tagName).d(format, logMsg)
    }

    /**
     * INFO日志格式化输出
     *
     * @param tagName
     * @param format
     * @param logMsg
     */
    fun i(
        tagName: String?,
        format: String?,
        vararg logMsg: Any?
    ) {
        Timber.tag(tagName).i(format, logMsg)
    }

    /**
     * WARN日志格式化输出
     *
     * @param tagName
     * @param format
     * @param logMsg
     */
    fun w(
        tagName: String?,
        format: String?,
        vararg logMsg: Any?
    ) {
        Timber.tag(tagName).w(format, logMsg)
    }

    /**
     * WARN日志格式化输出
     *
     * @param tagName
     * @param format
     * @param tr
     * @param logMsg
     */
    fun w(
        tagName: String?,
        format: String?,
        tr: Throwable?,
        vararg logMsg: Any?
    ) {
        Timber.tag(tagName).w(tr, format, logMsg)
    }

    /**
     * ERROR日志格式化输出
     *
     * @param tagName
     * @param format
     * @param logMsg
     */
    fun e(
        tagName: String?,
        format: String?,
        vararg logMsg: Any?
    ) {
        Timber.tag(tagName).e(format, logMsg)
    }

    fun e(
        tagName: String?,
        format: String?,
        tr: Throwable?,
        vararg logMsg: Any?
    ) {
        Timber.tag(tagName).e(tr, format, logMsg)
    }

    init {
        Timber.plant(Timber.DebugTree())
    }
}