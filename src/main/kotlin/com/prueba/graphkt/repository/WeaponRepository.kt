package com.prueba.graphkt.repository

import com.prueba.graphkt.entity.Weapon
import org.springframework.data.repository.reactive.ReactiveCrudRepository
import org.springframework.stereotype.Repository

@Repository
interface WeaponRepository : ReactiveCrudRepository<Weapon, Long> {
}