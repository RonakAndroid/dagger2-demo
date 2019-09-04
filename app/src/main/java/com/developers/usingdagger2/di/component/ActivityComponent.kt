package com.developers.usingdagger2.di.component

import com.developers.usingdagger2.main.MainActivity
import com.developers.usingdagger2.di.PerActivity
import com.developers.usingdagger2.di.module.ActivityModule
import dagger.Component

/**
 * Created by Ronak Thakkar 01/09/2018.
 */
@PerActivity
@Component(modules = arrayOf(ActivityModule::class), dependencies = arrayOf(ApplicationComponent::class))
interface ActivityComponent {

    fun inject(mainActivity: MainActivity)

}