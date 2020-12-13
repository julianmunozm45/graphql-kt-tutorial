package com.prueba.graphkt

import com.prueba.graphkt.entity.Weapon
import com.prueba.graphkt.repository.WeaponRepository
import kotlinx.coroutines.reactive.awaitFirstOrDefault
import kotlinx.coroutines.reactive.awaitSingle
import org.springframework.stereotype.Service

@Service
class WeaponService(private var weaponRepository: WeaponRepository) {
    suspend fun findAll(): List<Weapon> {
        return weaponRepository.findAll().collectList().awaitFirstOrDefault(listOf())
    }

    suspend fun findById(id: Long): Weapon? {
        return weaponRepository.findById(id).awaitSingle()
    }
}