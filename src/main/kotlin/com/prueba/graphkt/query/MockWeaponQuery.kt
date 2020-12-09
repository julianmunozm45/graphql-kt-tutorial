package com.prueba.graphkt.query

import com.expediagroup.graphql.spring.operations.Query
import com.prueba.graphkt.entity.MockWeapon
import com.prueba.graphkt.repository.MockWeaponRepository
import org.springframework.stereotype.Component

@Component
class MockWeaponQuery(private val repository: MockWeaponRepository) : Query {

    fun mockWeapons(): List<MockWeapon> {
        return repository.findAll()
    }

    fun mockWeapon(id: Long): MockWeapon? {
        return repository.findById(id)
    }
}