package com.example.a581k.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.a581k.Models.Post
import com.example.a581k.R
import com.google.android.material.imageview.ShapeableImageView

class PostsAdapter(var context: Context, var items: ArrayList<Post> ): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.posts, parent, false)
        return PostViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val post = items[position]

        if (holder is PostViewHolder){
            Glide.with(context).load(post.p_image).into(holder.s_image)
            holder.s_text.text = post.p_text
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class PostViewHolder(view: View): RecyclerView.ViewHolder(view){
        val  s_image: ShapeableImageView = view.findViewById(R.id.p_image)
        val s_text: TextView = view.findViewById(R.id.p_text)
    }

}