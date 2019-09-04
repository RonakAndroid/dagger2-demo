package com.developers.usingdagger2.main

/**
 * Created by Ronak Thakkar 01/09/2018.
 */
interface MainView {

    fun showLoading()

    fun showMessage(message:String)

    fun hideLoading()
}