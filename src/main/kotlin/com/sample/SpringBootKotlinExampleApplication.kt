package com.sample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class SpringBootKotlinExampleApplication

fun main(args: Array<String>) {
	runApplication<SpringBootKotlinExampleApplication>(*args)
}
