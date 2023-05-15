package com.cloud.config.server

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.config.server.EnableConfigServer

@SpringBootApplication
@EnableConfigServer
class SpringCloudConfigServerApplication

fun main(args: Array<String>) {
    runApplication<SpringCloudConfigServerApplication>(*args)
}
