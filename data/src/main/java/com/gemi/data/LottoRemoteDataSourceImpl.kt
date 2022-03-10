package com.gemi.data

import com.gemi.data.network.LottoService
import com.gemi.domain.LottoNumber
import com.gemi.domain.LottoRemoteDataSource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.await
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class LottoRemoteDataSourceImpl @Inject constructor(
    private val lottoService : LottoService
):LottoRemoteDataSource{
    override suspend fun getLottoNumber(drwNo: Int): LottoNumber = withContext(Dispatchers.IO){
        lottoService.getLottoNumber(drwNo).await().toLottoNumber()
    }
}