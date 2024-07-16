package com.cran.krittzPlay

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatTextView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var musicAdapter: MusicAdapter
    private val musicList = mutableListOf<Music>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btnPlaylist: AppCompatButton = findViewById(R.id.btnPlaylistView)
        val musicTitle = intent.getStringExtra("MUSIC_TITLE")
        val artistName = intent.getStringExtra("MUSIC_ARTIST")
        val musicFilePath = intent.getStringExtra("MUSIC_FILE_PATH")
        findViewById<AppCompatTextView>(R.id.mediaName).text = musicTitle
        btnPlaylist.setOnClickListener {
            val intent = Intent(this, MusicListActivity::class.java)
            startActivity(intent)
        }

    }
}