package com.example.demo.app

import com.example.demo.api.Greeting
import com.example.demo.utils.StringUtils
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController
@RequestMapping("/")
class DemoController {

  private val counter = AtomicLong()

  @GetMapping("/greeting")
  fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String): Greeting {
    return Greeting(counter.incrementAndGet(), StringUtils.greetingContent(name))
  }

}