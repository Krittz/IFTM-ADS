package com.cran.krittzPlay

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView

class MusicAdapter(
    private val musicList: List<Music>,
    private val onItemClick: (Music) -> Unit
) : RecyclerView.Adapter<MusicAdapter.MusicViewHolder>() {

    inner class MusicViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val titleMusic: AppCompatTextView = view.findViewById(R.id.musicName)
        val artistName: AppCompatTextView = view.findViewById(R.id.artistName)
        val filePath: AppCompatTextView = view.findViewById(R.id.filePath)

        init {
            itemView.setOnClickListener {
                val position = adapterPosition
                if (position != RecyclerView.NO_POSITION) {
                    onItemClick(musicList[position])
                }
            }

            itemView.setOnLongClickListener {
                val position = adapterPosition
                if (position != RecyclerView.NO_POSITION) {
                    showMusicDetailsDialog(musicList[position])
                }
                true // Indica que o evento foi consumido
            }
        }

        private fun showMusicDetailsDialog(music: Music) {
            val context = itemView.context
            val dialogBuilder = AlertDialog.Builder(context)
            dialogBuilder.setTitle("Detalhes da Música")
            dialogBuilder.setMessage("Nome: ${music.title}\nArtista: ${music.artist}\nCaminho: ${music.filePath}")

            dialogBuilder.setPositiveButton("OK") { dialog, which ->
                dialog.dismiss()
            }

            val dialog = dialogBuilder.create()
            dialog.show()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MusicViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_music, parent, false)
        return MusicViewHolder(view)
    }

    override fun onBindViewHolder(holder: MusicViewHolder, position: Int) {
        val music = musicList[position]
        holder.titleMusic.text = music.title
        holder.artistName.text = music.artist
        holder.filePath.text = music.filePath
    }

    override fun getItemCount() = musicList.size
}
