package com.istudio.code.modules.api_duration

import kotlinx.coroutines.delay
import kotlin.time.Duration
import kotlin.time.TimeSource.Monotonic.ValueTimeMark
import kotlin.time.TimeSource.Monotonic.markNow


class AsyncFeatureImpl : AsyncFeature {

    private var startingTime: ValueTimeMark? = null
    private var endingTime: ValueTimeMark? = null

    override suspend fun startingPoint() {
        startingTime = markNow()
        delay(5000)
    }

    override fun endingPoint() {
        endingTime = markNow()
        val finalTime : Duration = endingTime!! - startingTime!!
        println(finalTime)
    }

    
}

interface AsyncFeature {
    suspend fun startingPoint()
    fun endingPoint()
}