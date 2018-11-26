package com.sample.services

import org.springframework.stereotype.Service
import com.sample.model.Hello

@Service
class HelloService {
	
	fun sayHello(): String {
		val obj = Hello("Raj", "Test")
		return "hello"+obj.fname+" "+obj.lname+"!"
	}
}