package com.example.project

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


/**
 * Created by mohammad sajjad on 11-03-2022.
 * EMAIL mohammadsajjad679@gmail.com
 */

class WordViewModel(application: Application) : AndroidViewModel(application) {
    var dao=WordDataBase.getDatabase(application).getWordDao()
    var repository= WordRepository(dao)
    var allWords:LiveData<List<WordEntity>> = repository.allWords

    fun insertWord(word:WordEntity) = viewModelScope.launch(Dispatchers.IO){
        repository.insert(word)
    }
}