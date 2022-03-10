package com.gemi.myapplication

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.gemi.domain.GetLottoNumberUseCase
import com.gemi.domain.LottoNumber
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LottoViewModel @Inject constructor(
    private val getLottoNumberUseCase: GetLottoNumberUseCase
) : ViewModel() {
    val lottoNumberData: MutableLiveData<LottoNumber> = MutableLiveData()

    fun getLottoNumber(drwNo: Int) {
        viewModelScope.launch {
            val value = getLottoNumberUseCase(drwNo)
            lottoNumberData.value = value
        }
    }
}