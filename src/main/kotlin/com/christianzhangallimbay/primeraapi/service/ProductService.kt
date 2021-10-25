package com.christianzhangallimbay.primeraapi.service
import com.christianzhangallimbay.primeraapi.model.Producto
import com.christianzhangallimbay.primeraapi.repository.ProductRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ProductService {
        @Autowired
        lateinit var productRepository: ProductRepository
        fun list(): List<Producto> {
            return productRepository.findAll()
        }
}
