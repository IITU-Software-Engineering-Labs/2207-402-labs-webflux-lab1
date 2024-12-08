package com.example.demo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/mvc")
class MvcController {
    @GetMapping("/hello")
    @Throws(InterruptedException::class)
    fun hello(): String {
        Thread.sleep(100) // Симуляция задержки
        return "Hello from MVC!"
    }
}
