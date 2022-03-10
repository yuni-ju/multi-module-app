package com.gemi.domain

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class LottoNumber(
    val drwNo:Int,
    val drwtNo1:Int,
    val drwtNo2:Int,
    val drwtNo3:Int,
    val drwtNo4:Int,
    val drwtNo5:Int,
    val drwtNo6:Int,
    val bnusNo:Int
) : Parcelable