package org.godzzo.sb.sbkvscone.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

import org.godzzo.sb.sbkvscone.service.UserService

@RestController
@RequestMapping("user")
class UserController(
	private val userService : UserService
) {
	@GetMapping("/findAll")
	fun findAll() =
		userService.findAll()
}
