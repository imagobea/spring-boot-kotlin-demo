package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

data class Message(val id: String?, val text: String)

@RestController
class MessageController {
    @GetMapping("/")
    fun index() = listOf(
        Message("1", "hola"),
        Message("2", "hello"),
        Message("3", "konnichiwa")
    )
}

@SpringBootApplication
class DemoApplication

fun main(args: Array<String>) {
    runApplication<DemoApplication>(*args)
}
