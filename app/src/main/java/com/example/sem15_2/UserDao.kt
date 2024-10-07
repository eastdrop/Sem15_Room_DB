package com.example.sem15_2

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Transaction
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface UserDao {

    @Transaction
    @Query("SELECT * FROM user")
    fun getAll(): Flow<List<UserWithAddress>>

    @Insert(
        onConflict = OnConflictStrategy.REPLACE,
        entity = User::class)
    fun insert(user: NewUser)

    @Delete
    fun delete(user: User)

    @Update
    fun update(user: User)
}