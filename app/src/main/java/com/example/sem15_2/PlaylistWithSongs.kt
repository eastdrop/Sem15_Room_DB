package com.example.sem15_2

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation

data class PlaylistWithSongs(
    @Embedded
    val playlist: Playlist,
    @Relation(
        parentColumn = "id",
        entityColumn = "id",
        associateBy = Junction(
            PlaylistSong::class,
            parentColumn = "playlist_id",
            entityColumn = "song_id"
        )
    )
    val songs: List<Song>
)
