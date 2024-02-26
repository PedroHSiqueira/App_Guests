package com.example.guests.repository

import android.content.ContentValues
import android.content.Context
import com.example.guests.model.GuestModel
import java.lang.Exception

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

    fun insert(guest: GuestModel): Boolean {
        return try {
            val db = guestDataBase.writableDatabase

            val presence = if (guest.presence) 1 else 2

            //Carrega as informações para o banco
            val values = ContentValues()
            values.put("name", guest.name)
            values.put("presence", presence)

            // Inserindo Dados no banco de dados
            db.insert("Guest", null, values)

            true
        } catch (e: Exception) {
            false
        }
    }

    fun update() {}

}