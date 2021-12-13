package com.example.demo.api

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class GreetingTest {

  @Test fun testConstructor() {
    val greeting = Greeting(1, "Hello")
    assertEquals(1, greeting.id)
    assertEquals("Hello", greeting.content)
  }

}
