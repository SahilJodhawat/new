package com.example.project

import androidx.lifecycle.LiveData


/**
 * Created by mohammad sajjad on 11-03-2022.
 * EMAIL mohammadsajjad679@gmail.com
 */

class WordRepository(private val wordDao: WordDao) {
    val allWords:LiveData<List<WordEntity>> = wordDao.allNotes()

    suspend fun insert(word:WordEntity){
        wordDao.insert(word)
    }

    suspend fun delete(word: WordEntity){
        wordDao.delete(word)
    }

}