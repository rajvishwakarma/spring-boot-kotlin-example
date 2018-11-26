package com.sample.model

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType

@Entity
class Seller (
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	var sellerId: Int? = 0,
	
	var name: String? = null,
	var scrape_url: String? = null,
	var website: String? = null
)