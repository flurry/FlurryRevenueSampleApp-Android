package com.kotlin.trivialdrive

import android.app.Application
import android.util.Log
import com.flurry.android.FlurryAgent

class RevenueSampleApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        initFlurry()
    }

    private fun initFlurry() {
        FlurryAgent.Builder()
                .withLogLevel(Log.VERBOSE)
                .withLogEnabled(true)
                .build(this, getString(R.string.FLURRY_APIKEY))
    }
}