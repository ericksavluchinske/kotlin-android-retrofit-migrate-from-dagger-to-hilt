package com.example.retrofitdemocleandaggertohilt.presentation.di.core

import com.example.retrofitdemocleandaggertohilt.data.db.AlbumDao
import com.example.retrofitdemocleandaggertohilt.data.repository.album.datasource.AlbumLocalDataSource
import com.example.retrofitdemocleandaggertohilt.data.repository.album.datasourceImpl.AlbumLocalDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class LocalDataModule {

    @Singleton
    @Provides
    fun provideAlbumLocalDataSource(albumDao: AlbumDao): AlbumLocalDataSource {
        return AlbumLocalDataSourceImpl(albumDao)
    }
}