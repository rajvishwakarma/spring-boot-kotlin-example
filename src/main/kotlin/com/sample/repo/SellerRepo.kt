package com.sample.repo

import org.springframework.data.repository.CrudRepository
import com.sample.model.Seller

interface SellerRepo : CrudRepository<Seller, Int> {
}