package com.example.ejemplo_api.services

import com.example.ejemplo_api.models.Lenguaje
import com.example.ejemplo_api.repository.LenguajeRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class LenguajeService @Autowired constructor(private val lenguajeRepository: LenguajeRepository) {

    fun getAllLenguajes(): List<Lenguaje> {
        return lenguajeRepository.findAll().toList()
    }

    fun crearLenguaje(nuevoLenguaje: Lenguaje): String {
        return lenguajeRepository.save(nuevoLenguaje).let {
            "Nuevo lenguaje creado!, ID:  ${it.id}";
        }
    }
}
