package com.example.retrofitdemocleandaggertohilt.presentation.di.core

import com.example.retrofitdemocleandaggertohilt.data.repository.album.datasource.AlbumCacheDataSource
import com.example.retrofitdemocleandaggertohilt.data.repository.album.datasourceImpl.AlbumCacheDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class CacheDataModule {
    @Singleton
    @Provides
    fun provideAlbumCacheDataSource(): AlbumCacheDataSource {
        return AlbumCacheDataSourceImpl()
    }
}