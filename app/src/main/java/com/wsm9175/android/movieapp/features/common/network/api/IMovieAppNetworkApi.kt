package com.wsm9175.android.movieapp.features.common.network.api

import com.wsm9175.android.movieapp.features.common.network.model.MovieResponse
import com.wsm9175.android.movieapp.library.network.model.ApiResult

interface IMovieAppNetworkApi {
    suspend fun getMovies(): ApiResult<List<MovieResponse>>
}