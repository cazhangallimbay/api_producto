package com.christianzhangallimbay.primeraapi.controller

import com.christianzhangallimbay.primeraapi.model.Producto
import com.christianzhangallimbay.primeraapi.service.ProductService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/producto")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT])
class ProductController {
    @Autowired
    lateinit var ProductService: ProductService

    @GetMapping
    fun list(): List<Producto>{
        return ProductService.list()
    }
  @PostMapping
  fun save(@RequestBody producto: Producto): Producto{
    return ProductService.save(producto)
  }


}

