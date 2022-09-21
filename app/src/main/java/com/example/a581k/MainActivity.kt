package com.example.a581k

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.a581k.Adapter.PostsAdapter
import com.example.a581k.Adapter.StoryAdapter
import com.example.a581k.Models.Post
import com.example.a581k.Models.Story

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews(){
        recyclerView = findViewById(R.id.rvStory)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        getAdapter(getAllStories())

        recyclerView = findViewById(R.id.rvPost)
        recyclerView.layoutManager = GridLayoutManager(this, 1)
        getAdapter1(getAllPosts())
    }

    private fun getAdapter(list: ArrayList<Story>) {
        val adapter = StoryAdapter(this, list)
        recyclerView.adapter = adapter
    }

    private fun getAllStories(): ArrayList<Story>{
        val story = ArrayList<Story>()

        story.add(Story(R.drawable.birds, "Abbos"))
        story.add(Story(R.drawable.nissan, "Muslim"))
        story.add(Story(R.drawable.birds, "Bek"))
        story.add(Story(R.drawable.nissan, "Ali"))
        story.add(Story(R.drawable.birds, "Bek"))
        story.add(Story(R.drawable.nissan, "Messi"))
        story.add(Story(R.drawable.birds, "Ronaldo"))
        story.add(Story(R.drawable.nissan, "Neymar"))

        return story
    }

    private fun getAdapter1(list: ArrayList<Post>) {
        val adapter = PostsAdapter(this, list)
        recyclerView.adapter = adapter
    }

    private fun getAllPosts(): ArrayList<Post>{
        val story = ArrayList<Post>()

        story.add(Post(R.raw.video,"Abbosbek"))
        story.add(Post(R.raw.videoo,"Abbosbek"))
        story.add(Post(R.raw.video,"Abbosbek"))
        story.add(Post(R.raw.videoo,"Abbosbek"))
        return story
    }
}