package com.prueba.graphkt.config.init

import com.prueba.graphkt.entity.Weapon
import com.prueba.graphkt.repository.WeaponRepository
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Component

@Component
class DataInitializer(private val weaponRepository: WeaponRepository) : ApplicationRunner {

    override fun run(args: ApplicationArguments?) {
        val weapons = listOf(
                Weapon(1, "Whip"),
                Weapon(2, "Dagger"),
                Weapon(3, "Katana"),
                Weapon(4, "Boomerang"),
                Weapon(5, "Rapier"),
                Weapon(6, "Basilard"),
                Weapon(7, "Gurthang"),
                Weapon(8, "Marsil"),
                Weapon(9, "Claymore"),
                Weapon(10, "Morning star"),
        )
    }
}