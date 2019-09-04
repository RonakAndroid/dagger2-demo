package com.developers.usingdagger2.di.component

import android.content.Context
import com.developers.usingdagger2.di.ApplicationContext
import com.developers.usingdagger2.di.module.AppModule
import dagger.Component
import javax.inject.Singleton

/**
 * Created by Ronak Thakkar 01/09/2018.
 */
@Singleton
@Component(modules = arrayOf(AppModule::class))
interface ApplicationComponent {

    @ApplicationContext
    fun context(): Context
}