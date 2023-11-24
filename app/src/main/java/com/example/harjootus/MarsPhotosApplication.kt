package com.example.harjootus

import android.app.Application
import com.example.harjootus.data.AppContainer
import com.example.harjootus.data.DefaultAppContainer


class MarsPhotosApplication : android.app.Application() {
    /** AppContainer instance used by the rest of classes to obtain dependencies */
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }
}