package com.example.retrofitdemocleandaggertohilt.data.repository.album.datasourceImpl

import com.example.retrofitdemocleandaggertohilt.data.api.JSONPlaceHolderService
import com.example.retrofitdemocleandaggertohilt.data.model.album.AlbumList
import com.example.retrofitdemocleandaggertohilt.data.repository.album.datasource.AlbumRemoteDataSource
import retrofit2.Response

class AlbumRemoteDataSourceImpl(
    private val jsonPlaceHolderService: JSONPlaceHolderService,
): AlbumRemoteDataSource {
    override suspend fun getAlbums(): Response<AlbumList> = jsonPlaceHolderService.getAlbums()

}