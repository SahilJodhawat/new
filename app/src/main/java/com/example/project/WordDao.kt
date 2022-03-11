package com.example.project

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy.IGNORE
import androidx.room.Query


/**
 * Created by mohammad sajjad on 11-03-2022.
 * EMAIL mohammadsajjad679@gmail.com
 */
@Dao
interface WordDao {
    @Insert(onConflict=IGNORE)
    suspend fun insert(word:WordEntity)

    @Delete
    suspend fun delete(word:WordEntity)

    @Query("select * from words_table order by id ASC")
    fun allNotes():LiveData<List<WordEntity>>
}