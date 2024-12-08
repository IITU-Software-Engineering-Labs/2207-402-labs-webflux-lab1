package com.example.demo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono
import java.time.Duration

@RestController
@RequestMapping("/webflux")
class WebFluxController {

    @GetMapping("/hello")
    fun hello(): Mono<String> {
        return Mono.delay(Duration.ofMillis(100)) // Симуляция задержки
            .thenReturn("Hello from WebFlux!")
    }
}