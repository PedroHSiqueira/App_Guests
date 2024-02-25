package com.example.guests.repository

import android.content.Context

class GuestRepository private constructor(context: Context) {

    //Instanciando o Database
    private val guestDataBase = GuestDataBase(context)

    //Criando o Singleton

    companion object {
        private lateinit var repository: GuestRepository

        fun getInstance(context: Context): GuestRepository {

            //Se o repositorio não foi inicializado ele criará uma instancia
            if (Companion::repository.isInitialized) {
                repository = GuestRepository(context)
            }
            // Se já foi instanciado ele só retornara ele, sem uma nova criação
            return repository
        }
    }

    fun get(){}

    fun update(){}

}