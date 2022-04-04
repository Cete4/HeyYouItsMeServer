package com.example.heyyouitsmeserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.*
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class HeyYouItsMeServerApplication

fun main(args: Array<String>) {
    runApplication<HeyYouItsMeServerApplication>(*args)
}

@RestController
@RequestMapping("/api")
class RestController {

    @GetMapping(value = ["/message"])
    fun getMessage(): Message {
        println("EVENT: /api/message GET")
        return Message(
            id = 1,
            content = "You're amazing"
        )
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

    data class Message(
        val id: Int,
        val content: String
    )
}