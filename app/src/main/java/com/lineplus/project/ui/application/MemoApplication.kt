package com.lineplus.project.ui.application

import android.app.Application
import com.lineplus.project.di.module
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MemoApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        initializeKoin()
    }

    private fun initializeKoin() {
        startKoin {
            androidContext(this@MemoApplication)
            modules(module)
        }
    }
}
