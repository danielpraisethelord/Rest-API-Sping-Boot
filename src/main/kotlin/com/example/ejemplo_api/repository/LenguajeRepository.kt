package com.example.ejemplo_api.repository

import com.example.ejemplo_api.models.Lenguaje
import org.springframework.data.repository.CrudRepository

interface LenguajeRepository: CrudRepository<Lenguaje, Int> {

}