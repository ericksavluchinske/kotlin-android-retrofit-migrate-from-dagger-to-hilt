package com.example.retrofitdemocleandaggertohilt.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.retrofitdemocleandaggertohilt.data.model.album.Album

@Database(entities = [Album::class], version = 1)
abstract class JSONPHDatabase: RoomDatabase() {

    abstract fun albumDao(): AlbumDao
}