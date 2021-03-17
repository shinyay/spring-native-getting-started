package com.google

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringNativeGsApplication

fun main(args: Array<String>) {
	runApplication<SpringNativeGsApplication>(*args)
}
