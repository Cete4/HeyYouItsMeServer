package com.example.heyyouitsmeserver.controller

import com.example.heyyouitsmeserver.model.Message
import com.example.heyyouitsmeserver.repo.MessageRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RequestMapping("/api")
@RestController
class MessageController (){

    @Autowired
    lateinit var repository: MessageRepository

    @GetMapping(value = ["/message"])
    fun getMessage(): String {
        println("EVENT: /api/message GET")
        var message = Message("It worked");
        repository.save(message)
        return "Success"
    }

    @PostMapping(value = ["/message"])
    fun postMessage(): String {
        println("EVENT: /api/message POST")
        return "Success"
    }

    @PutMapping(value = ["/message"])
    fun putMessage(): String {
        println("EVENT: /api/message POST")
        return "Success"
    }

    @DeleteMapping(value = ["/message"])
    fun deleteMessage(): String {
        println("EVENT: /api/message POST")
        return "Success"
    }

}