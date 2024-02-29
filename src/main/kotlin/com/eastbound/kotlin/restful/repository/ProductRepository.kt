package com.eastbound.kotlin.restful.repository

import com.eastbound.kotlin.restful.entity.Product
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository : JpaRepository<Product, String>{

}