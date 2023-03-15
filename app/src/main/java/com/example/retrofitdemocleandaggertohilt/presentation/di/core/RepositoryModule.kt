package com.example.retrofitdemocleandaggertohilt.presentation.di.core

import com.example.retrofitdemocleandaggertohilt.data.repository.album.AlbumRepositoryImpl
import com.example.retrofitdemocleandaggertohilt.data.repository.album.datasource.AlbumCacheDataSource
import com.example.retrofitdemocleandaggertohilt.data.repository.album.datasource.AlbumLocalDataSource
import com.example.retrofitdemocleandaggertohilt.data.repository.album.datasource.AlbumRemoteDataSource
import com.example.retrofitdemocleandaggertohilt.domain.repository.AlbumRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Provides
    @Singleton
    fun provideAlbumRepository(
        albumRemoteDatasource: AlbumRemoteDataSource,
        albumLocalDataSource: AlbumLocalDataSource,
        albumCacheDataSource: AlbumCacheDataSource
    ): AlbumRepository {

        return AlbumRepositoryImpl(
            albumRemoteDatasource,
            albumLocalDataSource,
            albumCacheDataSource
        )
    }
}