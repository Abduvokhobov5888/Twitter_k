package com.example.a581k.Adapter

import android.content.Context
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.VideoView
import androidx.recyclerview.widget.RecyclerView
import com.example.a581k.Models.Post
import com.example.a581k.R

class PostsAdapter(var context: Context, var items: ArrayList<Post> ): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.posts, parent, false)
        return PostViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val post = items[position]

        if (holder is PostViewHolder){
            holder.p_text.text = post.p_text
            holder.p_video.setVideoURI(Uri.parse("android.resource://" + context.getPackageName() + "/" + post.p_image))
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class PostViewHolder(view: View): RecyclerView.ViewHolder(view){
        val  p_video: VideoView = view.findViewById(R.id.p_video)
        val p_text: TextView = view.findViewById(R.id.p_text)

    }

}