package com.example.demo.utils

class StringUtils {
  companion object {
    private const val template = "Hello, %s!"

    fun greetingContent(name: String): String {
      return String.format(template, name)
    }
  }
}
