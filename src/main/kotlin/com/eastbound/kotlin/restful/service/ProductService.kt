package com.eastbound.kotlin.restful.service

import com.eastbound.kotlin.restful.model.CreateProductRequest
import com.eastbound.kotlin.restful.model.ProductResponse

interface ProductService {

    fun create(createProductRequest: CreateProductRequest): ProductResponse

}