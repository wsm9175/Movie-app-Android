package com.wsm9175.android.movieapp.library.network.retrofit

import com.wsm9175.android.movieapp.library.network.model.ApiResult
import com.wsm9175.android.movieapp.library.network.model.NetworkRequestInfo
import java.lang.reflect.Type

interface NetworkRequestFactory {

    suspend fun <T> create(
        url: String,
        requestInfo: NetworkRequestInfo = NetworkRequestInfo.Builder().build(),
        type: Type
    ): ApiResult<T>
}
