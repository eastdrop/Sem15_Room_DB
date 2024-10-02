package com.example.sem15_2

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [
        User::class,
        Address::class,
        Playlist::class,
        Song::class,
        PlaylistSong::class
    ],
    version = 2,
    exportSchema = true
)
abstract class AppDataBase : RoomDatabase() {
    abstract fun UserDao(): UserDao
}