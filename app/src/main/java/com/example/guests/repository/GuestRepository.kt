package com.example.guests.repository

class GuestRepository private constructor() {

    //Criando o Singleton

    companion object {
        private lateinit var repository: GuestRepository

        fun getInstance(): GuestRepository {

            //Se o repositorio não foi inicializado ele criará uma instancia
            if (Companion::repository.isInitialized) {
                repository = GuestRepository()
            }
            // Se já foi instanciado ele só retornara ele, sem uma nova criação
            return repository
        }
    }
}