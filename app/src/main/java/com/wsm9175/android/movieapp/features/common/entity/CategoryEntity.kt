package com.wsm9175.android.movieapp.features.common.entity

data class CategoryEntity(
    val id: Int,
    val genre: String,
    val movieFeedEntities: List<MovieFeedItemEntity>
)
