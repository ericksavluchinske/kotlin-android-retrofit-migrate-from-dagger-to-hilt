package com.example.retrofitdemocleandaggertohilt.data.repository.album.datasourceImpl

import com.example.retrofitdemocleandaggertohilt.data.db.AlbumDao
import com.example.retrofitdemocleandaggertohilt.data.model.album.Album
import com.example.retrofitdemocleandaggertohilt.data.repository.album.datasource.AlbumLocalDataSource
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class AlbumLocalDataSourceImpl(
    private val albumDao: AlbumDao
): AlbumLocalDataSource {
    override suspend fun getAlbumsFromDB(): List<Album> {
        return albumDao.getAlbums()
    }

    override suspend fun saveAlbumsToDB(albums: List<Album>) {
        CoroutineScope(Dispatchers.IO).launch {
            albumDao.saveAlbums(albums)
        }
    }

    override suspend fun clearAll() {
        CoroutineScope(Dispatchers.IO).launch {
            albumDao.deleteAllAlbums()
        }
    }
}