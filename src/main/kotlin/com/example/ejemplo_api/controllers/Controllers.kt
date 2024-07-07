package com.example.ejemplo_api.controllers

import com.example.ejemplo_api.models.Lenguaje
import com.example.ejemplo_api.services.LenguajeService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class Controllers @Autowired constructor(private val lenguajeService: LenguajeService) {

    @GetMapping("/")
    fun holaMundo(): String {
        return "Hola mundo desde Spring Boot, en Kotlin"
    }

    @GetMapping("/lenguaje")
    fun leerLenguajes(): List<Lenguaje> {
        return lenguajeService.getAllLenguajes()
    }

    @PostMapping("/lenguaje")
    fun crearLenguaje(
            @RequestBody nuevoLenguaje : Lenguaje
    ): String {
        return lenguajeService.crearLenguaje(nuevoLenguaje);
    }
}