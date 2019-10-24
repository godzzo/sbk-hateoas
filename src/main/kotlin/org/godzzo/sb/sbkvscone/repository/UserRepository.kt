package org.godzzo.sb.sbkvscone.repository

import org.godzzo.sb.sbkvscone.domain.User

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface UserRepository : JpaRepository<User, Long> 
