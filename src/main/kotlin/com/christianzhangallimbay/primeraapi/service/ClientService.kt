package com.christianzhangallimbay.primeraapi.service

import com.christianzhangallimbay.primeraapi.model.Client
import com.christianzhangallimbay.primeraapi.repository.ClientRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ClientService {
  @Autowired
  lateinit var ClientRepository: ClientRepository


  fun list(): List<Client> {

    return ClientRepository.findAll()
  }

  fun save(client: Client): Client  {

    return ClientRepository.save(client)
  }
  fun update(client: Client): Client  {

    return ClientRepository.save(client)

  }

  fun updateDescription (client: Client):Client {
    val response = ClientRepository.findById(client.id)

      ?: throw Exception()

    response.apply {
      this.nombre =client.nombre
    }
    return ClientRepository.save(response)
  }

  fun delete (id:Long): Boolean{
    ClientRepository.deleteById(id)
    return true
  }
}

