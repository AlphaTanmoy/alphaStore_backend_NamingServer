package com.AlphaStore.NamingServer

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class NamingServerApplication

fun main(args: Array<String>) {
    SpringApplication.run(NamingServerApplication::class.java, *args)
}
