package com.gemi.domain

import javax.inject.Inject

class GetLottoNumberUseCase @Inject constructor(
    private val lottoRepository: LottoRepository
){
    suspend operator fun invoke(drwNo: Int) = lottoRepository.getLottoNumber(drwNo)
}