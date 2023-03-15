package com.example.retrofitdemocleandaggertohilt.presentation

import android.app.Application
import com.example.retrofitdemocleandaggertohilt.BuildConfig
import com.example.retrofitdemocleandaggertohilt.presentation.di.Injector
import com.example.retrofitdemocleandaggertohilt.presentation.di.album.AlbumSubComponent
import com.example.retrofitdemocleandaggertohilt.presentation.di.core.*

class App : Application(), Injector {
    private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder()
            .appModule(AppModule(applicationContext))
            .netModule(NetModule(BuildConfig.BASE_URL))
            .remoteDataModule(RemoteDataModule())
            .build()

    }
    override fun createAlbumSubComponent(): AlbumSubComponent {
        return appComponent.albumSubComponent().create()
    }
}