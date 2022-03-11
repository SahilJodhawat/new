package com.example.project


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    lateinit var viewModel: WordViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val input:EditText=findViewById(R.id.input)
        val submit:Button=findViewById(R.id.submit)
        val recyclerView:RecyclerView=findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter=WordAdapter(this)
        recyclerView.adapter=adapter
        viewModel=ViewModelProvider(this,ViewModelProvider.AndroidViewModelFactory
            .getInstance(application)).get(WordViewModel::class.java)
        viewModel.allWords.observe(this, Observer {
            adapter.updateList(it)

        })
        submit.setOnClickListener {
         val wordText=input.text.toString()
            if(wordText.isNotEmpty()){
                viewModel.insertWord(WordEntity(wordText))
               input.text.clear()
            }
        }

    }

    }
