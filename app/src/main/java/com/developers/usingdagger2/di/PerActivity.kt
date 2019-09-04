package com.developers.usingdagger2.di

import java.lang.annotation.RetentionPolicy
import javax.inject.Qualifier
import javax.inject.Scope

/**
 * Created by Ronak Thakkar 01/09/2018.
 */
@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class PerActivity