package com.molokoka.dagger_reflect_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.Dagger
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var dependency: ExampleAndroidDependency

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Dagger.create(ExampleComponent::class.java).inject(this)
    }
}
