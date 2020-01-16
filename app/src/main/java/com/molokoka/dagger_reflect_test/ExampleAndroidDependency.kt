package com.molokoka.dagger_reflect_test

import android.annotation.TargetApi
import android.app.NotificationChannel
import javax.inject.Inject

class ExampleAndroidDependency @Inject constructor() {

    private fun getChannel(): NotificationChannel? { // dagger-reflect fails here
        return null
    }

//    @TargetApi(26) // fails too
//    private fun getChannel(): NotificationChannel? {
//        return null
//    }
}