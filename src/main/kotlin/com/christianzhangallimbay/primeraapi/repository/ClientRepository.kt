package com.christianzhangallimbay.primeraapi.repository

import com.christianzhangallimbay.primeraapi.model.Client
import org.springframework.data.jpa.repository.JpaRepository

interface ClientRepository: JpaRepository<Client, Long> {
fun findById (id: Long?): Client?
}



