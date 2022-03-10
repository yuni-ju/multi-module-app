package com.gemi.domain

interface LottoRemoteDataSource {

    suspend fun getLottoNumber(drwNo: Int): LottoNumber
}