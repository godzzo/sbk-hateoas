package org.godzzo.sb.sbkvscone.controller

import java.util.concurrent.atomic.AtomicLong
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("greeting")
class GreetingController {

    val counter = AtomicLong()

    @GetMapping("/hello")
    fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String) =
        Greeting(counter.incrementAndGet(), "Hello, $name")
}

data class Greeting(val id: Long, val content: String)
