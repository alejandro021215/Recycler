package com.example.recycler.db

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [Nota::class],
    version = 1

)
abstract class NotasDB:RoomDatabase() {
    abstract fun notaDao():NotaDao

}