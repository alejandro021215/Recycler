package com.example.recycler.db

import androidx.room.*

@Dao
interface NotaDao {
    @Query("SELECT * FROM Nota")
    suspend fun obtenerTodas():List<Nota>

    @Query("SELECT * FROM Nota WHERE id=:id")
    suspend fun getById(id:Int):Nota

    @Update
    suspend fun update(nota: Nota)

    @Insert
    suspend fun insert(notas:List<Nota>)

    @Delete
    suspend fun delete(nota: Nota)
}