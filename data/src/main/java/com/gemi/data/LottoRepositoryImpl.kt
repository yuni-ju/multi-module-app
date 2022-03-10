package com.gemi.data

import com.gemi.domain.LottoNumber
import com.gemi.domain.LottoRemoteDataSource
import com.gemi.domain.LottoRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class LottoRepositoryImpl @Inject constructor(
    private val remoteDataSource: LottoRemoteDataSource
) : LottoRepository {
    override suspend fun getLottoNumber(drwNo: Int): LottoNumber =
        remoteDataSource.getLottoNumber(drwNo)
}