package com.prueba.graphkt

import com.prueba.graphkt.entity.Weapon
import com.prueba.graphkt.repository.WeaponRepository
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
class WeaponService(private var weaponRepository: WeaponRepository) {
    fun findAll(): Mono<List<Weapon>> {
        return weaponRepository.findAll().collectList()
    }

    fun findById(id: Long): Mono<Weapon> {
        return weaponRepository.findById(id)
    }
}