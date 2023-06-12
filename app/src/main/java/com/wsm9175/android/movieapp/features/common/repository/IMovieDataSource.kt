package com.wsm9175.android.movieapp.features.common.repository

import com.wsm9175.android.movieapp.features.common.entity.CategoryEntity
import com.wsm9175.android.movieapp.features.common.entity.EntityWrapper
import com.wsm9175.android.movieapp.features.common.entity.MovieDetailEntity
import com.wsm9175.android.movieapp.features.feed.domain.enum.SortOrder

interface IMovieDataSource {
    suspend fun getCategories(sortOrder: SortOrder? = null): EntityWrapper<List<CategoryEntity>>
    suspend fun getMovieDetail(movieName: String): MovieDetailEntity

}