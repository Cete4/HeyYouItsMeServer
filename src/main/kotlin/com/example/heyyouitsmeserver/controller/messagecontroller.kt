package com.example.heyyouitsmeserver.controller

import com.example.heyyouitsmeserver.model.Message
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RequestMapping("/ingredients")
@RestController
class messageController {

    @Autowired

    @GetMapping(value = ["/message"])
    fun getMessage(): Message {
        println("EVENT: /api/message GET")
        return Message()
    }

    @PostMapping(value = ["/message"])
    fun postMessage(): Success {
        println("EVENT: /api/message POST")
        return Success()
    }

    @PutMapping(value = ["/message"])
    fun putMessage(): Success {
        println("EVENT: /api/message POST")
        return Success()
    }

    @DeleteMapping(value = ["/message"])
    fun deleteMessage(): Success {
        println("EVENT: /api/message POST")
        return Success()
    }

    data class Success(
        val message: String = "Success"
    )

}