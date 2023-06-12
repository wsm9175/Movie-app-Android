package com.wsm9175.android.movieapp.library.storage.usecases

import com.wsm9175.android.movieapp.library.storage.IStorage
import com.wsm9175.android.movieapp.library.storage.usecases.IStorageClearUseCase
import javax.inject.Inject

class StorageClearUseCase @Inject constructor(
    private val storage: IStorage
) : IStorageClearUseCase {
    override fun invoke() {
        storage.clear()
    }
}
