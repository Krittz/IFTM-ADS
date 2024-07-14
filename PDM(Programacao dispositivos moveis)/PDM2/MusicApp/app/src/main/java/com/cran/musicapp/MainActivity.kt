package com.cran.musicapp

import android.annotation.SuppressLint

import android.content.res.AssetFileDescriptor
import android.media.MediaPlayer
import android.os.Bundle

import android.util.Log
import android.view.View

import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton

import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.chibde.visualizer.SquareBarVisualizer


import java.io.IOException

class MainActivity : AppCompatActivity() {

    lateinit var mediaPlayer: MediaPlayer
    lateinit var visualizer: SquareBarVisualizer

    @SuppressLint("MissingInflatedId")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        mediaPlayer = MediaPlayer()
        try {
            val assetDescriptor: AssetFileDescriptor = assets.openFd("eminem_superman.mp3")
            mediaPlayer.setDataSource(
                assetDescriptor.fileDescriptor, assetDescriptor.startOffset, assetDescriptor.length
            )
            assetDescriptor.close()
            mediaPlayer.prepare()
        } catch (e: IOException) {
            Log.e("MainActivity", "Error setting data source: ${e.message}")

        }

        val playButton: AppCompatButton = findViewById(R.id.btnPlay)
        playButton.setOnClickListener { play(it) }


    }

    fun play(view: View) {
        try {
            mediaPlayer.setVolume(1f, 1f);

            mediaPlayer.start()
            visualizer.setGap(2)
            visualizer.setDensity(256F)
            visualizer.setColor(R.color.white)
            visualizer.setPlayer(mediaPlayer.audioSessionId)


        } catch (e: Exception) {
            Log.e("IFTM", e.message.toString())
            Log.e("IFTM", e.toString())
        }
    }


}