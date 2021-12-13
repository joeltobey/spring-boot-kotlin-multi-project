package com.example.demo.utils

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class StringUtilsTest {

  @Test fun testGreetingContent() {
    val name = "John"
    assertEquals("Hello, John!", StringUtils.greetingContent(name))
  }

}
