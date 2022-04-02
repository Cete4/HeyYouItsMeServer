package com.example.heyyouitsmeserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
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
    fun message(): Message {
        return Message(
            id = 1,
            content = "You're amazing"
        )
    }

    data class Message(
        val id: Int,
        val content: String
    )
}