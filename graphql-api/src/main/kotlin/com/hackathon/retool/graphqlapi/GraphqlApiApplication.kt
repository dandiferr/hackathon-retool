package com.hackathon.retool.graphqlapi

import com.coxautodev.graphql.tools.SchemaParser
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Component
import java.util.concurrent.Flow
import javax.management.Query

@SpringBootApplication
class GraphqlApiApplication

fun main(args: Array<String>) {
	runApplication<GraphqlApiApplication>(*args)
}
