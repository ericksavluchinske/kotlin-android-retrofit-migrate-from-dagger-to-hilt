package com.example.retrofitdemocleandaggertohilt.data.repository.album.datasource

import com.example.retrofitdemocleandaggertohilt.data.model.album.Album

interface AlbumCacheDataSource {

    suspend fun getAlbumsFromCache(): List<Album>

    suspend fun saveAlbumsToCache(albums: List<Album>)
}