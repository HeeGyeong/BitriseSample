package com.example.bitrisesample

open class MockSample {
    open fun getNumber(): Int {
        return 1
    }

    open fun getString(): String {
        return "get String"
    }

    open fun getList(): List<String> {
        return listOf("123")
    }
}