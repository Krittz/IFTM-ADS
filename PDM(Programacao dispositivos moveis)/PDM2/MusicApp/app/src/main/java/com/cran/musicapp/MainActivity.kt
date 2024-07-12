package com.cran.musicapp

import android.annotation.SuppressLint
import android.app.NotificationManager
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.media.MediaPlayer
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.os.PowerManager
import android.os.PowerManager.WakeLock
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.app.ActivityCompat
import androidx.core.app.NotificationManagerCompat
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.chibde.visualizer.BarVisualizer
import com.chibde.visualizer.CircleBarVisualizer
import com.chibde.visualizer.CircleBarVisualizerSmooth

class MainActivity : AppCompatActivity() {

    lateinit var mediaPlayer: MediaPlayer
    lateinit var visualizer: CircleBarVisualizer

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
        visualizer = findViewById(R.id.visualizer)
        val playButton: AppCompatButton = findViewById(R.id.btnPlay)
        val backButton: AppCompatButton = findViewById(R.id.btnBack)
        val nextButton: AppCompatButton = findViewById(R.id.btnNext)
        val repeatButton: AppCompatButton = findViewById(R.id.btnRepeat)
        val randomButton: AppCompatButton = findViewById(R.id.btnRandom)

        mediaPlayer = MediaPlayer()
        val descriptor = assets.openFd("eminem_superman.mp3")
        mediaPlayer.setDataSource(
            descriptor.fileDescriptor,
            descriptor.startOffset,
            descriptor.length
        )
        descriptor.close()


    }

    fun play(view: View) {
        try {
            mediaPlayer.setVolume(1f, 1f);
            mediaPlayer.prepare()
            mediaPlayer.start()

            visualizer.setPlayer(mediaPlayer.getAudioSessionId());

        } catch (e: Exception) {
            Log.e("IFTM", e.message.toString())
            Log.e("IFTM", e.toString())
        }
    }


}