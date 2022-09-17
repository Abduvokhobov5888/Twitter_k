package com.example.a581k.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.a581k.Models.Story
import com.example.a581k.R
import com.google.android.material.imageview.ShapeableImageView

class StoryAdapter(var context: Context, var items: ArrayList<Story>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.stories, parent, false)
        return StoryViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val story = items[position]

        if (holder is StoryViewHolder){
            Glide.with(context).load(story.s_image).into(holder.s_image)
            holder.s_text.text = story.s_text
        }
    }

    override fun getItemCount(): Int {
       return items.size
    }

    class StoryViewHolder(view: View): RecyclerView.ViewHolder(view){
        val  s_image:ShapeableImageView = view.findViewById(R.id.s_image)
        val s_text:TextView = view.findViewById(R.id.s_text)
    }

}