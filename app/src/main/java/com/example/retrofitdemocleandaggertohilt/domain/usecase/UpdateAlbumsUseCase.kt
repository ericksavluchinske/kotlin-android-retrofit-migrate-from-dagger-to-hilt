package com.example.retrofitdemocleandaggertohilt.domain.usecase

import com.example.retrofitdemocleandaggertohilt.data.model.album.Album
import com.example.retrofitdemocleandaggertohilt.domain.repository.AlbumRepository

class UpdateAlbumsUseCase(private val albumRepository: AlbumRepository) {
    suspend fun execute(): List<Album>? = albumRepository.updateAlbums()
}