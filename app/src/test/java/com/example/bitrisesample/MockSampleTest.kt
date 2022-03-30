package com.example.bitrisesample

import org.junit.Before
import org.junit.Test
import org.mockito.Mockito
import com.google.common.truth.Truth.assertThat

class MockSampleTest {

    private lateinit var mock: MockSample

    @Before
    fun before() {
        mock = Mockito.mock(MockSample::class.java)
        Mockito.`when`(mock.getNumber()).thenReturn(222)
        Mockito.`when`(mock.getString()).thenReturn("100")
    }

    @Test
    fun mockito_test() {
        assertThat(mock.getNumber()).isEqualTo(222)
        assertThat(mock.getString()).contains("100")
    }

    @Test
    fun mockito_answer_test() {
        answer()

        assertThat(mock.getNumber()).isEqualTo(369)
        assertThat(mock.getList()).hasSize(1)
    }

    @Test
    fun verify_test() {
        mock.getString()
        mock.getList()

        Mockito.verify(mock).getList()
        Mockito.verify(mock, Mockito.times(1)).getString()
        Mockito.verify(mock, Mockito.never()).getNumber()

        mock.getString()
        Mockito.verify(mock, Mockito.times(2)).getString()
    }

    private fun answer() {
        Mockito.`when`(mock.getList()).thenAnswer {
            println("print Message")

            return@thenAnswer listOf("mock")
        }

        Mockito.`when`(mock.getNumber()).thenAnswer {
            println("mock.getNumber ? ${it.arguments.size}")

            return@thenAnswer 369
        }

    }
}