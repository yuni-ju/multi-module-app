package com.gemi.data

import com.gemi.data.network.LottoNumberDto
import com.gemi.domain.LottoNumber

fun LottoNumberDto.toLottoNumber(): LottoNumber = 
    LottoNumber(
         drwNo,
         drwtNo1,
         drwtNo2,
         drwtNo3,
         drwtNo4,
         drwtNo5,
         drwtNo6,
         bnusNo
    )