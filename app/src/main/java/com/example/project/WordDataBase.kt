package com.example.project

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


/**
 * Created by mohammad sajjad on 11-03-2022.
 * EMAIL mohammadsajjad679@gmail.com
 */
@Database(entities = arrayOf(WordEntity::class),version = 1,exportSchema = false)
 abstract class WordDataBase : RoomDatabase() {
    abstract fun getWordDao():WordDao

     companion object{
         private var INSTANCE:WordDataBase?=null
         fun getDatabase(context: Context):WordDataBase{
             return INSTANCE?: synchronized(this){
                 val instance=Room.databaseBuilder(context.applicationContext,
                 WordDataBase::class.java,"words_database").build()
                 INSTANCE=instance
                 instance
             }

         }

     }
}