package com.wsm9175.android.movieapp.features.common.di

import com.wsm9175.android.movieapp.features.common.network.api.IMovieAppNetworkApi
import com.wsm9175.android.movieapp.features.common.network.api.MovieAppNetworkApi
import com.wsm9175.android.movieapp.features.common.repository.IMovieDataSource
import com.wsm9175.android.movieapp.features.common.repository.MovieRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

//abstract binds 형식은 기존 class provides(class의 인스턴스를 제공) 와 다르게
//interface의 instance를 제공한다.
@Module
@InstallIn(SingletonComponent::class)
abstract class MovieDataModule {
    @Singleton
    @Binds
    abstract fun bindMovieRepository(movieRepository: MovieRepository): IMovieDataSource

    @Singleton
    @Binds
    abstract fun bindNetwork(networkApi: MovieAppNetworkApi): IMovieAppNetworkApi
}