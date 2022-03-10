package com.gemi.domain

interface LottoRepository {

    suspend fun getLottoNumber(drwNo: Int): LottoNumber
}