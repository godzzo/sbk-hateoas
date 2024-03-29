package org.godzzo.sb.sbkvscone

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoApplication : SpringBootServletInitializer()

fun configure(application: SpringApplicationBuilder): SpringApplicationBuilder {
	println(">>>>> DemoApplication - configure - Called :)")

	return application.sources(DemoApplication::class.java)
}

fun main(args: Array<String>) {
	println(">>>>> DemoApplication - main - Called :)")

	runApplication<DemoApplication>(*args)
}
