package com.christianzhangallimbay.primeraapi.controller

import com.christianzhangallimbay.primeraapi.model.Client
import com.christianzhangallimbay.primeraapi.service.ClientService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/cliente")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT])
class ClientController {
  @Autowired
  lateinit var ClientService: ClientService

  @GetMapping
  fun list(): List<Client>{
    return ClientService.list()
  }
  @PostMapping
 fun save (@RequestBody client: Client):Client{
   return ClientService.save(client)

 }

  @PutMapping
  fun update (@RequestBody client: Client):Client{
    return ClientService.update(client)
    
}

  @PatchMapping
  fun updateDescription (@RequestBody client: Client):Client{
    return ClientService.updateDescription(client)
  }

  @DeleteMapping("/delete/{id}")
  fun delete (@PathVariable("id") id: Long):Boolean{
    return ClientService.delete(id)
  }

}

