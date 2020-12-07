package com.prueba.graphkt.query

import com.expediagroup.graphql.spring.operations.Query
import com.prueba.graphkt.entity.Weapon
import com.prueba.graphkt.repository.WeaponRepository
import kotlinx.coroutines.reactive.awaitFirst
import kotlinx.coroutines.reactive.awaitSingle
import org.springframework.stereotype.Component

@Component
class WeaponQuery(private val weaponRepository: WeaponRepository) : Query {

    suspend fun weapons(): MutableList<Weapon>? {
        return weaponRepository.findAll().collectList().awaitFirst()
    }

    suspend fun weapon(id: Long): Weapon? {
        return weaponRepository.findById(id).awaitSingle()
    }
}