package com.istudio.code

import androidx.lifecycle.ViewModel
import com.istudio.code.modules.api_datetime.DateTimeApiModule
import com.istudio.code.modules.api_duration.DurationApiModule

class MainViewModel : ViewModel() {

    fun initiate() {
        DateTimeApiModule().localDate()
    }

}