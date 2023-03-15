package com.example.retrofitdemocleandaggertohilt.presentation.di.core

import com.example.retrofitdemocleandaggertohilt.data.db.AlbumDao
import com.example.retrofitdemocleandaggertohilt.data.repository.album.datasource.AlbumLocalDataSource
import com.example.retrofitdemocleandaggertohilt.data.repository.album.datasourceImpl.AlbumLocalDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class LocalDataModule {

    @Singleton
    @Provides
    fun provideAlbumLocalDataSource(albumDao: AlbumDao): AlbumLocalDataSource {
        return AlbumLocalDataSourceImpl(albumDao)
    }
}