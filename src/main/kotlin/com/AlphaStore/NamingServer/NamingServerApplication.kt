package com.alphaStore.NamingServer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class NamingServerApplication

fun main(args: Array<String>) {
	runApplication<NamingServerApplication>(*args)
}
