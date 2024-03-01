package com.eastbound.kotlin.restful.service.impl

import com.eastbound.kotlin.restful.entity.Product
import com.eastbound.kotlin.restful.model.CreateProductRequest
import com.eastbound.kotlin.restful.model.ProductResponse
import com.eastbound.kotlin.restful.repository.ProductRepository
import com.eastbound.kotlin.restful.service.ProductService
import com.eastbound.kotlin.restful.validation.ValidationUtil
import org.springframework.stereotype.Service
import java.util.*

@Service
class ProductServiceImpl(val productRepository: ProductRepository, val validationUtil: ValidationUtil) : ProductService {
    override fun create(createProductRequest: CreateProductRequest): ProductResponse {
        validationUtil.validate(createProductRequest)

        val product = Product(
            id = createProductRequest.id!!,
            name = createProductRequest.name!!,
            price = createProductRequest.price!!,
            quantity = createProductRequest.quantity!!,
            createdAt = Date(),
            updatedAt = null
        )

//        Insert atau save ke database, itu mengapa ada fungsi save karena JPA sudah ada fungsi nya, jadi kita tinggal pakai saja
        productRepository.save(product)

        return ProductResponse(
            id = product.id,
            name = product.name,
            price = product.price,
            quantity = product.quantity,
            createdAt = product.createdAt,
            updatedAt = product.updatedAt
        )
    }
}