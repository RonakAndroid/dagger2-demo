package com.developers.usingdagger2.di.module

import android.app.Application
import android.content.Context
import com.developers.usingdagger2.di.ApplicationContext
import dagger.Module
import dagger.Provides

/**
 * Created by Ronak Thakkar 01/09/2018.
 */
@Module
class AppModule(val app: Application) {

    @Provides
    fun provideApplication(): Application {
        return app
    }

    @Provides
    @ApplicationContext
    fun provideContext(): Context {
        return app
    }

}