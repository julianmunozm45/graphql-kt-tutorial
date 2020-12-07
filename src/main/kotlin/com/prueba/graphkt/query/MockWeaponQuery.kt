package com.prueba.graphkt.query

import com.expediagroup.graphql.spring.operations.Query
import com.prueba.graphkt.entity.Weapon
import com.prueba.graphkt.repository.MockWeaponRepository
import org.springframework.stereotype.Component

@Component
class MockWeaponQuery(private val repository: MockWeaponRepository) : Query {

    fun mockWeapons(): List<Weapon> {
        return repository.findAll()
    }

    fun mockWeapon(id: Int): List<Weapon> {
        return repository.findById(id)
    }
}