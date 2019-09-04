package com.developers.usingdagger2

import android.app.Application
import android.content.Context
import com.developers.usingdagger2.di.module.AppModule
import com.developers.usingdagger2.di.component.ApplicationComponent
import com.developers.usingdagger2.di.component.DaggerApplicationComponent


/**
 * Created by Ronak Thakkar 01/09/2018.
 */
class InitApplication : Application() {


    companion object {
        fun get(context: Context): InitApplication {
            return context.applicationContext as InitApplication
        }
    }

    fun component(): ApplicationComponent {
        val appComponent = DaggerApplicationComponent.builder()
                    .appModule(AppModule(this))
                    .build()
        return appComponent
    }

}