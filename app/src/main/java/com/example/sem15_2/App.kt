package com.example.sem15_2

import android.app.Application
import androidx.room.Room

class App : Application() {
    lateinit var db: AppDataBase
    override fun onCreate() {
        super.onCreate()
        db = Room
            .databaseBuilder(
                applicationContext,
                AppDataBase::class.java,
                "db"
            )
            .addMigrations(MIGRATION_1_2)
            .build()
    }

   /* companion object {
        lateinit var INSTANCE: App
            private set
    }*/
}