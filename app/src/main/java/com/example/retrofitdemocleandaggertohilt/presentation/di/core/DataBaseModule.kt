package com.example.retrofitdemocleandaggertohilt.presentation.di.core

import android.app.Application
import android.content.Context
import androidx.room.Room
import com.example.retrofitdemocleandaggertohilt.data.db.AlbumDao
import com.example.retrofitdemocleandaggertohilt.data.db.JSONPHDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DataBaseModule {
    @Singleton
    @Provides
    fun provideAlbumDataBase(app: Application): JSONPHDatabase {
        return Room.databaseBuilder(app,JSONPHDatabase::class.java,"jsonph")
            .build()
    }
    @Singleton
    @Provides
    fun provideAlbumDao(jsonPHDatabase: JSONPHDatabase): AlbumDao {
        return jsonPHDatabase.albumDao()
    }
}