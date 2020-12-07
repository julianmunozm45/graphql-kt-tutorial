package com.prueba.graphkt.repository

import com.prueba.graphkt.entity.Weapon
import org.springframework.stereotype.Component

@Component
class MockWeaponRepository {
    fun findAll(): List<Weapon> = listOf(Weapon(1, "ew"))

    fun findById(id: Int): List<Weapon> = listOf(Weapon(1, "ew"))
}