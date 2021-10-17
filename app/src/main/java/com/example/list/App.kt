package com.example.list

import com.example.list.di.component.AppComponent
import com.example.list.di.component.DaggerAppComponent

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class App: DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        val appComponent: AppComponent = DaggerAppComponent.builder()
            .application(this)
            .build()

        appComponent.inject(this)
        return appComponent
    }

}
