package com.istudio.code.di

import org.koin.androidx.viewmodel.dsl.viewModelOf
import com.istudio.code.MainViewModel
import org.koin.dsl.module

val appModule = module {
    viewModelOf(::MainViewModel)
}