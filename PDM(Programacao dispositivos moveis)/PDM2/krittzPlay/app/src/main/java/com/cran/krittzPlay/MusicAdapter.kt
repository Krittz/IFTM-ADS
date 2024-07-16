package com.cran.krittzPlay

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView

class MusicAdapter(
    private val musicList: List<Music>,
    private val onItemClick: (Music) -> Unit
) : RecyclerView.Adapter<MusicAdapter.MusicViewHolder>() {
    class MusicViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val titleMusic: AppCompatTextView = view.findViewById(R.id.musicName)
        val artistName: AppCompatTextView = view.findViewById(R.id.artistName)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MusicViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_music, parent, false)
        return MusicViewHolder(view)
    }

    override fun onBindViewHolder(holder: MusicViewHolder, position: Int) {
        val music = musicList[position]
        holder.titleMusic.text = music.title
        holder.artistName.text = music.artist
        holder.itemView.setOnClickListener {
            onItemClick(music)
        }
    }

    override fun getItemCount() = musicList.size
}