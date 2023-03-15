package com.example.retrofitdemocleandaggertohilt.presentation.album

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.retrofitdemocleandaggertohilt.domain.usecase.GetAlbumsUseCase
import com.example.retrofitdemocleandaggertohilt.domain.usecase.UpdateAlbumsUseCase

class AlbumsViewModelFactory(
    private val getAlbumsUseCase: GetAlbumsUseCase,
    private val updateAlbumsUseCase: UpdateAlbumsUseCase
): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return AlbumsViewModel(getAlbumsUseCase,updateAlbumsUseCase) as T
    }
}