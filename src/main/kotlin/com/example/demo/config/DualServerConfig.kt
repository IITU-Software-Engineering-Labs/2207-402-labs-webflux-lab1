package com.example.demo.config

import org.springframework.boot.web.embedded.netty.NettyReactiveWebServerFactory
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory
import org.springframework.boot.web.server.WebServerFactoryCustomizer
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class DualServerConfig {
    @Bean
    fun mvcServer(): WebServerFactoryCustomizer<TomcatServletWebServerFactory> {
        return WebServerFactoryCustomizer { factory: TomcatServletWebServerFactory ->
            factory.port =
                8080
        } // Tomcat для MVC
    }

    @Bean
    fun webfluxServer(): WebServerFactoryCustomizer<NettyReactiveWebServerFactory> {
        return WebServerFactoryCustomizer { factory: NettyReactiveWebServerFactory ->
            factory.port =
                8081
        } // Netty для WebFlux
    }
}
