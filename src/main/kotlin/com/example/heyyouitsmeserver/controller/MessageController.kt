package com.example.heyyouitsmeserver.controller

import com.example.heyyouitsmeserver.model.Message
import com.example.heyyouitsmeserver.repo.MessageRepository
import com.google.gson.Gson
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RequestMapping("/api")
@RestController
class MessageController() {

    @Autowired
    lateinit var repository: MessageRepository


    @GetMapping(value = ["/message"])
    fun getMessage(): String {
        println("EVENT: /api/message GET")
        return "{\"message\": \"success\"," + "\"messages\"" + ":" + Gson().toJson(repository.findAll()) + "}"
    }

    @PostMapping(value = ["/message"])
    fun postMessage(@RequestBody message: Message): String {
        repository.save(message)
        println("EVENT: /api/message POST")
        return "{\"message\": \"success\"," + "\"messages\"" + ":" + Gson().toJson(repository.findAll()) + "}"
    }

    @PutMapping(value = ["/message"])
    fun putMessage(@RequestBody message: Message): String {
        println("EVENT: /api/message PUT")
        repository.save(message)
        return "{\"message\": \"success\"," + "\"messages\"" + ":" + Gson().toJson(repository.findAll()) + "}"
    }

    @DeleteMapping(value = ["/message"])
    fun deleteMessage(@RequestBody message: Message): String {
        println("EVENT: /api/message POST")
        try {
            repository.deleteById(message.id)
            return "Success"
        } catch (error: Exception) {
            println(error)
            return "ERROR: Starting at Line 38 in MessageController.kt"
        }
    }
}