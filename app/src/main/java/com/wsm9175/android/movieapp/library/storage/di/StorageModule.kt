package com.wsm9175.android.movieapp.library.storage.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import com.wsm9175.android.movieapp.library.storage.IStorage
import com.wsm9175.android.movieapp.library.storage.StorageManager
import com.wsm9175.android.movieapp.library.storage.helpers.DataConverter
import com.wsm9175.android.movieapp.library.storage.helpers.DataEncoding
import com.wsm9175.android.movieapp.library.storage.prefs.SharedPrefsStorageProvider
import com.wsm9175.android.movieapp.library.storage.prefs.StorageProvider
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class StorageModule {

    @Singleton
    @Provides
    fun bindOnDiscStorage(
        storage: StorageProvider,
        converter: DataConverter,
        encoding: DataEncoding
    ): IStorage = StorageManager(storage, converter, encoding)

    @Provides
    fun provideSharePrefStorageProvider(provider: SharedPrefsStorageProvider): StorageProvider =
        provider

}
