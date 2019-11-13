package org.tyaa.reactivemongospringbootapp

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication
class ReactiveMongoSpringbootappApplication

fun main(args: Array<String>) {
	runApplication<ReactiveMongoSpringbootappApplication>(*args)
}
