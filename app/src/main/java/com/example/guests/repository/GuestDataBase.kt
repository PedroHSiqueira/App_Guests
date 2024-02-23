package com.example.guests.repository

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

//Banco de dados
class GuestDataBase(context: Context) : SQLiteOpenHelper(context, NAME, null, VERSION) {

    // "consts" para evitar que o banco tenho controle sobre isto
    companion object {
        private const val NAME = "guestdb"
        private const val VERSION = 1
    }

    //Método de criação do Banco de Dados
    override fun onCreate(db: SQLiteDatabase) {
        //Execução de comandos SQL
        db.execSQL("CREATE TABLE Guest (id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, presence INTEGER);")
    }

    //Método de Atualizção do Banco de Dados
    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {

    }

}