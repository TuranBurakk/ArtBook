package com.example.artbook.roomdb

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
    interface ArtDao {
        @Insert(onConflict = OnConflictStrategy.REPLACE)
        suspend fun insertArt(art: Art)
        @Delete
        suspend fun deleteArt(art: Art)
        @Query("SELECT * From arts")
        fun observeArts(): LiveData<List<Art>>





}