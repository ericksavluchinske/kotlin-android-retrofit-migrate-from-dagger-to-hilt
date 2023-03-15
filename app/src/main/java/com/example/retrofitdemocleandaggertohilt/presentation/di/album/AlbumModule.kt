package com.example.retrofitdemocleandaggertohilt.presentation.di.album

import com.example.retrofitdemocleandaggertohilt.domain.usecase.GetAlbumsUseCase
import com.example.retrofitdemocleandaggertohilt.domain.usecase.UpdateAlbumsUseCase
import com.example.retrofitdemocleandaggertohilt.presentation.album.AlbumsViewModelFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped

@Module
@InstallIn(ActivityComponent::class)
class AlbumModule {
    @ActivityScoped
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