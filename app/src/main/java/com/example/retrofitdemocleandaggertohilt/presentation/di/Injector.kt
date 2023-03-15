package com.example.retrofitdemocleandaggertohilt.presentation.di

import com.example.retrofitdemocleandaggertohilt.presentation.di.album.AlbumSubComponent

interface Injector {
    fun createAlbumSubComponent(): AlbumSubComponent
}