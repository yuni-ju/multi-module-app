package com.gemi.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.gemi.myapplication.R
import com.gemi.myapplication.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!
    private val lottoViewModel by viewModels<LottoViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        lottoViewModel.lottoNumberData.observe(this){
            binding.lotto = it
            binding.invalidateAll()
        }

        lottoViewModel.getLottoNumber(1005)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}