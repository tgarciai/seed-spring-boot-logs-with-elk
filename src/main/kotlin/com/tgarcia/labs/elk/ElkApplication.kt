package com.tgarcia.labs.elk


import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ElkApplication


fun main(args: Array<String>) {
	runApplication<ElkApplication>(*args)
}
