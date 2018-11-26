package com.sample.controller

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping
import com.sample.services.HelloService
import com.sample.model.Seller
import com.sample.services.SellerService

@RestController
open class SampleController(val helloservice: HelloService, val sellerService: SellerService) {
	
	@GetMapping("/hello")
	fun hello(): String{
		return helloservice.sayHello()
	}
	
	@GetMapping("/sellers")
	fun getSellers(): Iterable<Seller>{
		return sellerService.getSellers()
	}
}