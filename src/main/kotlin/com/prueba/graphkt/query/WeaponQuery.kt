package com.prueba.graphkt.query

import com.expediagroup.graphql.spring.operations.Query
import com.prueba.graphkt.WeaponService
import com.prueba.graphkt.entity.Weapon
import org.springframework.stereotype.Component

@Component
class WeaponQuery(private val weaponService: WeaponService) : Query {

    suspend fun weapons(): List<Weapon> {
        return weaponService.findAll()
    }

    suspend fun weapon(id: Long): Weapon? {
        return weaponService.findById(id)
    }
}