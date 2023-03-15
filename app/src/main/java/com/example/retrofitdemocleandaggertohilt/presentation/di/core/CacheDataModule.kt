package com.example.retrofitdemocleandaggertohilt.presentation.di.core

import com.example.retrofitdemocleandaggertohilt.data.repository.album.datasource.AlbumCacheDataSource
import com.example.retrofitdemocleandaggertohilt.data.repository.album.datasourceImpl.AlbumCacheDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CacheDataModule {
    @Singleton
    @Provides
    fun provideAlbumCacheDataSource(): AlbumCacheDataSource {
        return AlbumCacheDataSourceImpl()
    }
}