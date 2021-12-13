plugins {
  id("com.example.demo.kotlin-spring-conventions")
}

tasks.jar {
  enabled = false
}

dependencies {
  implementation(project(":lib"))
}
