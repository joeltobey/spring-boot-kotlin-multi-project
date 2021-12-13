plugins {
  id("com.example.demo.kotlin-library-conventions")
}

tasks.jar {
  enabled = true
}

dependencies {
  api(project(":api"))
}
