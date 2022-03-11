package com.example.project

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


/**
 * Created by mohammad sajjad on 11-03-2022.
 * EMAIL mohammadsajjad679@gmail.com
 */
@Entity(tableName = "words_table")
class WordEntity(@ColumnInfo(name = "words")val note:String,
                 @PrimaryKey(autoGenerate = true)var id: Int =0) {
}