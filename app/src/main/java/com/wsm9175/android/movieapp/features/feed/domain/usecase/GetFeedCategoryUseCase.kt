package com.wsm9175.android.movieapp.features.feed.domain.usecase

import com.wsm9175.android.movieapp.features.common.entity.CategoryEntity
import com.wsm9175.android.movieapp.features.common.entity.EntityWrapper
import com.wsm9175.android.movieapp.features.feed.domain.enum.SortOrder

interface IGetFeedCategoryUseCase {
    suspend operator fun invoke(sortOrder: SortOrder? =null): EntityWrapper<List<CategoryEntity>>
}