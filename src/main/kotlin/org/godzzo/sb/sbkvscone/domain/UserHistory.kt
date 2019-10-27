package org.godzzo.sb.sbkvscone.domain

import javax.persistence.*
import javax.validation.constraints.*;

@Entity
@Table(name = "user_history")
data class UserHistory(
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	val id: Long = 0,

	@ManyToOne
	@JoinColumn(name = "user_id")
	val user: User
)
