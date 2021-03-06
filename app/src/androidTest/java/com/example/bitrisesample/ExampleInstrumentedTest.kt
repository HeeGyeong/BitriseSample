package com.example.bitrisesample

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Rule

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    @get:Rule
    var activityRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun ui_test_sample() {
        Espresso.onView(withId(R.id.button_first))
            .perform(ViewActions.click())
        Espresso.onView(withId(R.id.button_second))
            .perform(ViewActions.click())
    }

    /*@Test
    fun ui_fail_test() {
        Espresso.onView(withId(R.id.button_first))
            .perform(ViewActions.click())
        Espresso.onView(withId(R.id.button_first))
            .perform(ViewActions.click())
        Espresso.onView(withId(R.id.button_second))
            .perform(ViewActions.click())
    }*/
}