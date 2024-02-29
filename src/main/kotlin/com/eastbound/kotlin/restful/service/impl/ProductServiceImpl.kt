package com.eastbound.kotlin.restful.service.impl

import com.eastbound.kotlin.restful.model.CreateProductRequest
import com.eastbound.kotlin.restful.model.ProductResponse
import com.eastbound.kotlin.restful.service.ProductService
import org.springframework.stereotype.Service

@Service
class ProductServiceImpl : ProductService {
    override fun create(createProductRequest: CreateProductRequest): ProductResponse {
        TODO("Not yet implemented")
    }
}