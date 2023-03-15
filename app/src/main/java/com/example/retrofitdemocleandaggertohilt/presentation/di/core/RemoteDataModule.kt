package com.example.retrofitdemocleandaggertohilt.presentation.di.core

import com.example.retrofitdemocleandaggertohilt.data.api.JSONPlaceHolderService
import com.example.retrofitdemocleandaggertohilt.data.repository.album.datasource.AlbumRemoteDataSource
import com.example.retrofitdemocleandaggertohilt.data.repository.album.datasourceImpl.AlbumRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RemoteDataModule() {
    @Singleton
    @Provides
    fun provideAlbumRemoteDataSource(jsonPlaceHolderService: JSONPlaceHolderService): AlbumRemoteDataSource {
        return AlbumRemoteDataSourceImpl(
            jsonPlaceHolderService
        )
    }
}