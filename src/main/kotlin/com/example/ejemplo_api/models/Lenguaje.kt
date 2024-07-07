package com.example.ejemplo_api.models

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "mis_lenguajes")
data class Lenguaje(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "ID")
        var id: Int? = null,

        val nombre: String,
        val lanzamiento: String,
        val tipado_fuerte: Boolean
)
