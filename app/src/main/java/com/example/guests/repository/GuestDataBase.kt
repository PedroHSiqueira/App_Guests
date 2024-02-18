package com.example.guests.repository

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class GuestDataBase(context: Context) : SQLiteOpenHelper(context, NAME, null, VERSION) {

    companion object {
        private const val NAME = "guestdb"
        private const val VERSION = 1
    }

    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL("CREATE TABLE Guest (id integer PRIMARY KEY AUTOINCREMENT, name text, precense integer);")
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {

    }
}