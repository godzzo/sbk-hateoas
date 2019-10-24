package org.godzzo.sb.sbkvscone.service

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import org.godzzo.sb.sbkvscone.domain.User
import org.godzzo.sb.sbkvscone.repository.UserRepository

@Service
@Transactional
class UserService(
	private val userRepository: UserRepository
) {

	val log : Logger = LoggerFactory.getLogger(UserService::class.java)

	fun findAll() : List<User> {
		return userRepository.findAll()
	}

}
