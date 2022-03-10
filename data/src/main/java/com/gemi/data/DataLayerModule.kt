package com.gemi.data

import com.gemi.data.network.LottoService
import com.gemi.domain.LottoRemoteDataSource
import com.gemi.domain.LottoRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DataLayerModule {
    @Provides
    @Singleton
    fun provideLottoRepository(remoteDataSource: LottoRemoteDataSource): LottoRepository =
        LottoRepositoryImpl(remoteDataSource)

    @Provides
    @Singleton
    fun providesLottoRemoteDataSource(lottoService: LottoService): LottoRemoteDataSource =
        LottoRemoteDataSourceImpl(lottoService)
}