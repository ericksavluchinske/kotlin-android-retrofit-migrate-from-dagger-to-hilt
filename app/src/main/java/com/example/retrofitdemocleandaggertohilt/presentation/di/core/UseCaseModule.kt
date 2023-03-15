package com.example.retrofitdemocleandaggertohilt.presentation.di.core

import com.example.retrofitdemocleandaggertohilt.domain.repository.AlbumRepository
import com.example.retrofitdemocleandaggertohilt.domain.usecase.GetAlbumsUseCase
import com.example.retrofitdemocleandaggertohilt.domain.usecase.UpdateAlbumsUseCase
import dagger.Module
import dagger.Provides

@Module
class UseCaseModule {

    @Provides
    fun provideGetAlbumsUseCase(albumRepository: AlbumRepository): GetAlbumsUseCase {
        return GetAlbumsUseCase(albumRepository)
    }
    @Provides
    fun provideUpdateAlbumsUseCase(albumRepository: AlbumRepository): UpdateAlbumsUseCase {
        return UpdateAlbumsUseCase(albumRepository)
    }
}