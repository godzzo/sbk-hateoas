package org.godzzo.sb.sbkvscone.domain

import javax.persistence.*
import javax.validation.constraints.*;

@Entity
@Table(name = "user")
data class User(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @NotNull
    @Size(min = 1, max = 50)
    @Column(length = 50, unique = true, nullable = false)
    val login: String
)
