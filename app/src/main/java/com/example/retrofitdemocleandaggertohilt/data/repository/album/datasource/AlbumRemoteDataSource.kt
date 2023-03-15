package com.example.retrofitdemocleandaggertohilt.data.repository.album.datasource

import com.example.retrofitdemocleandaggertohilt.data.model.album.AlbumList
import retrofit2.Response

interface AlbumRemoteDataSource {

    suspend fun getAlbums(): Response<AlbumList>
}