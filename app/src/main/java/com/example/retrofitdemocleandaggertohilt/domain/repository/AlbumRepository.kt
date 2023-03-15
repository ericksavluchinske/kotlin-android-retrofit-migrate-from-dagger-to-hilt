package com.example.retrofitdemocleandaggertohilt.domain.repository

import com.example.retrofitdemocleandaggertohilt.data.model.album.Album

interface AlbumRepository {

    suspend fun getAlbums(): List<Album>?

    suspend fun updateAlbums(): List<Album>?
}