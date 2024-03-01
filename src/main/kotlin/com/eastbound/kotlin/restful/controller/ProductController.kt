package com.eastbound.kotlin.restful.controller

import com.eastbound.kotlin.restful.model.CreateProductRequest
import com.eastbound.kotlin.restful.model.ProductResponse
import com.eastbound.kotlin.restful.model.WebResponse
import com.eastbound.kotlin.restful.service.ProductService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class ProductController(val productService: ProductService) {

    @PostMapping(
        value = ["/api/products"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun createProduct(@RequestBody body: CreateProductRequest): WebResponse<ProductResponse> {
        val productResponse = productService.create(body)

        return WebResponse(
            code = 200,
            status = "OK",
            data = productResponse
        )
    }

}