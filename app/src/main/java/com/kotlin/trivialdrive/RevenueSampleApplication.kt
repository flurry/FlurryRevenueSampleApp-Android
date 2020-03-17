package com.kotlin.trivialdrive

import android.app.Application
import android.util.Log
import com.flurry.android.FlurryAgent
import com.flurry.android.wrapper.analytics.FlogWrapper

class RevenueSampleApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        initFlurry()
    }

    private fun initFlurry() {
        FlogWrapper.setInternalLoggingEnabled(true)
        FlurryAgent.Builder()
                .withLogLevel(Log.VERBOSE)
                .withLogEnabled(true)
                .build(this, getString(R.string.FLURRY_APIKEY))
    }
}