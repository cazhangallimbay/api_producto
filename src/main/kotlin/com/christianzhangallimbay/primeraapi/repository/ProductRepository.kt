package com.christianzhangallimbay.primeraapi.repository
import com.christianzhangallimbay.primeraapi.model.Producto
import org.springframework.data.jpa.repository.JpaRepository
interface ProductRepository:JpaRepository <Producto,Long>{}