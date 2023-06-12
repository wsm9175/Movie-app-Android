package com.wsm9175.android.movieapp.features.common.network.api

import com.google.gson.reflect.TypeToken
import com.wsm9175.android.movieapp.features.common.network.model.MovieResponse
import com.wsm9175.android.movieapp.library.network.model.ApiResult
import com.wsm9175.android.movieapp.library.network.retrofit.NetworkRequestFactory
import javax.inject.Inject

class MovieAppNetworkApi @Inject constructor(
    private val networkRequestFactory: NetworkRequestFactory
): IMovieAppNetworkApi {
    override suspend fun getMovies(): ApiResult<List<MovieResponse>> {
        return networkRequestFactory.create(
            url = "top250.json",
            type = object : TypeToken<List<MovieResponse>>(){}.type
        )
    }

}