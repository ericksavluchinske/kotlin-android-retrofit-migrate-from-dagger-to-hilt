package com.example.retrofitdemocleandaggertohilt.presentation.di.album

import com.example.retrofitdemocleandaggertohilt.domain.usecase.GetAlbumsUseCase
import com.example.retrofitdemocleandaggertohilt.domain.usecase.UpdateAlbumsUseCase
import com.example.retrofitdemocleandaggertohilt.presentation.album.AlbumsViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class AlbumModule {
    @AlbumScope
    @Provides
    fun provideAlbumsViewModelFactory(
        getAlbumsUseCase: GetAlbumsUseCase,
        updateAlbumsUsecase: UpdateAlbumsUseCase
    ): AlbumsViewModelFactory {
        return AlbumsViewModelFactory(
            getAlbumsUseCase,
            updateAlbumsUsecase
        )
    }
}