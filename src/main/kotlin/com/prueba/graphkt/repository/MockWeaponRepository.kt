package com.prueba.graphkt.repository

import com.prueba.graphkt.entity.MockWeapon
import org.springframework.stereotype.Component

@Component
class MockWeaponRepository {
    fun findAll(): List<MockWeapon> = listOf(MockWeapon(1, "Rod"),MockWeapon(2, "Axe"))

    fun findById(id: Long): MockWeapon? = listOf(MockWeapon(1, "Rod"))
            .find { id == it.id }
}