package com.molokoka.dagger_reflect_test

import dagger.Component

@Component
interface ExampleComponent {

    fun inject(i: MainActivity)
}