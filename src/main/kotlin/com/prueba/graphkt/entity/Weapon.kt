package com.prueba.graphkt.entity

import org.springframework.data.annotation.Id

data class Weapon(
        @Id
        val id: Long,
        val name: String,
)
