package com.example.bitrisesample

import org.junit.After
import org.junit.Assert
import org.junit.Test
import org.junit.Before
import com.google.common.truth.Truth.assertThat

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    private lateinit var calCul: Calculator

    @Before
    fun before() {
        calCul = Calculator()
    }

    @After
    fun after() {

    }

    @Test
    fun plus_test() {
        val result = calCul.plusNum(10, 20)
        assertThat(result).isEqualTo(30)
    }

    @Test
    fun multi_test() {
        val result = calCul.multiNum(10, 10)
        assertThat(result).isEqualTo(100)
        assertThat(result + sample()).isEqualTo(110)
        assertThat(result).isNotNull()
        plus_test()
    }

    private fun sample(): Int {
        return 10
    }

    @Test
    fun truth_type_test() {
        assertThat(true).isTrue()
        assertThat(10.1f).isGreaterThan(10)
        assertThat("string").hasLength(6)
    }

    @Test
    fun junit_test() {
        val result = 10
        Assert.assertEquals(result, 10)
        Assert.assertNull(null)
    }
}