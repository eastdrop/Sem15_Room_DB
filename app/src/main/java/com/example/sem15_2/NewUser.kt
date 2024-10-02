package com.example.sem15_2

import androidx.room.ColumnInfo
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey

data class NewUser(
    @ColumnInfo(name = "first_name")
    val firstName: String,
    @ColumnInfo(name = "last_name")
    val lastName: String,
    @ColumnInfo(name = "age")
    val age: Int,
    @PrimaryKey
    @ColumnInfo(name = "id")
    val id: Long? = null,
)
