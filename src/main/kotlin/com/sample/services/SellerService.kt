package com.sample.services

import org.springframework.stereotype.Service
import com.sample.model.Seller
import com.sample.repo.SellerRepo

@Service
class SellerService(val sellerRepo : SellerRepo) {
	
	fun getSellers() = sellerRepo.findAll()
}