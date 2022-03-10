package com.gemi.data.network

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {

    @Provides
    @Singleton
    fun provideRetrofit(): Retrofit =
        Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(LOTTO_URL)
            .build()

    @Provides
    @Singleton
    fun provideMovieService(retrofit: Retrofit): LottoService =
        retrofit.create(LottoService::class.java)


    companion object {
        private const val LOTTO_URL = "https://www.dhlottery.co.kr"
    }
}
