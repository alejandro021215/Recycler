package com.example.recycler

import android.app.Application
import androidx.room.Room
import com.example.recycler.db.NotasDB

class NotaApp: Application() {

        val room = Room
            .databaseBuilder(this,NotasDB::class.java,"notas_db")
            .build()

}