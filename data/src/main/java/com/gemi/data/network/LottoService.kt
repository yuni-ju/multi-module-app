package com.gemi.data.network

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface LottoService {

    @GET("/common.do?method=getLottoNumber")
    fun getLottoNumber(@Query("drwNo") drwNo:Int): Call<LottoNumberDto>
}