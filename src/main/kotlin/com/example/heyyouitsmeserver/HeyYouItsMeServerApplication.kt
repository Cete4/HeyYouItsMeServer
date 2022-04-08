package com.example.heyyouitsmeserver

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class HeyYouItsMeServer {

}


fun main(args: Array<String>) {
    SpringApplication.run(HeyYouItsMeServer::class.java, *args)
}