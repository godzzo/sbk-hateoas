package org.godzzo.sb.sbkvscone.domain

import javax.persistence.*
import javax.validation.constraints.*;

@Entity
@Table(name = "user")
data class User(
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	val id: Long = 0,

	@NotNull
	@Size(min = 1, max = 50)
	@Column(length = 50, unique = true, nullable = false)
	val login: String,

	/*
		mappedBy - memeber field of the Many side entity
		https://stackoverflow.com/questions/45642181/kotlin-jpa-encapsulate-onetomany
	 */
	@OneToMany(mappedBy = "user", cascade = [CascadeType.ALL])
	val history: MutableList<UserHistory> = mutableListOf()
)
