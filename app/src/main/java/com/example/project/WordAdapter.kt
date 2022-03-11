package com.example.project

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


/**
 * Created by mohammad sajjad on 11-03-2022.
 * EMAIL mohammadsajjad679@gmail.com
 */

class WordAdapter(context: Context) : RecyclerView.Adapter<WordAdapter.WordViewHolder>() {
    val allWords=ArrayList<WordEntity>()
    inner class WordViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textView:TextView=itemView.findViewById(R.id.word)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):WordViewHolder {
        val view=WordViewHolder(LayoutInflater.from(parent.context).inflate(
            R.layout.items,parent,false))
        return view

    }

    override fun onBindViewHolder(holder: WordViewHolder, position: Int) {
        holder.textView.text = allWords.get(position).note
    }
    fun updateList(newList: List<WordEntity>){
        allWords.clear()
        allWords.addAll(newList)
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
       return allWords.size
    }
}