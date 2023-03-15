package com.example.retrofitdemocleandaggertohilt.presentation.di.core

import com.example.retrofitdemocleandaggertohilt.data.api.JSONPlaceHolderService
import com.example.retrofitdemocleandaggertohilt.data.repository.album.datasource.AlbumRemoteDataSource
import com.example.retrofitdemocleandaggertohilt.data.repository.album.datasourceImpl.AlbumRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RemoteDataModule() {
    @Singleton
    @Provides
    fun provideAlbumRemoteDataSource(jsonPlaceHolderService: JSONPlaceHolderService): AlbumRemoteDataSource {
        return AlbumRemoteDataSourceImpl(
            jsonPlaceHolderService
        )
    }
}