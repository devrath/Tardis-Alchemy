package com.istudio.code.modules.api_duration

import kotlin.time.Duration
import kotlin.time.Duration.Companion.days
import kotlin.time.Duration.Companion.hours
import kotlin.time.Duration.Companion.microseconds
import kotlin.time.Duration.Companion.milliseconds
import kotlin.time.Duration.Companion.minutes
import kotlin.time.Duration.Companion.nanoseconds
import kotlin.time.Duration.Companion.parseIsoStringOrNull
import kotlin.time.Duration.Companion.seconds
import kotlin.time.measureTime

class DurationApiModule {

    fun representation() {
        val oneDay : Duration = 1.days
        val oneHour : Duration = 1.hours
        val oneMinute : Duration = 1.minutes
        val oneSecond : Duration = 1.seconds
        val oneMilliSeconds : Duration = 1.milliseconds
        val oneMicroSeconds : Duration = 1.microseconds
        val oneNanoSeconds : Duration = 1.nanoseconds

        println("One Day:-------------------->  $oneDay")
        println("One hours:------------------>  $oneHour")
        println("One minutes:---------------->  $oneMinute")
        println("One Second:----------------->  $oneSecond")
        println("One Milli Seconds:---------->  $oneMilliSeconds")
        println("One Micro Seconds:---------->  $oneMicroSeconds")
        println("One Nano Seconds:----------->  $oneNanoSeconds")
    }

    fun inWholeNumber() {
        val oneDay : Duration = 1.days
        val oneHour : Duration = 1.hours
        val oneMinute : Duration = 1.minutes
        val oneSecond : Duration = 1.seconds
        val oneMilliSeconds : Duration = 1.milliseconds
        val oneMicroSeconds : Duration = 1.microseconds
        val oneNanoSeconds : Duration = 1.nanoseconds

        println("One Day in whole no:-------------------->  ${oneDay.inWholeDays}")
        println("One hours in whole no:------------------>  ${oneHour.inWholeHours}")
        println("One minutes in whole no:---------------->  ${oneMinute.inWholeMinutes}")
        println("One Second in whole no:----------------->  ${oneSecond.inWholeSeconds}")
        println("One Milli Seconds in whole no:---------->  ${oneMilliSeconds.inWholeMilliseconds}")
        println("One Micro Seconds in whole no:---------->  ${oneMicroSeconds.inWholeMicroseconds}")
        println("One Nano Seconds in whole no:----------->  ${oneNanoSeconds.inWholeNanoseconds}")
    }

    fun subtractDays() {
        val startDays : Duration = 9.days
        val finalDays : Duration = 10.days
        val result = finalDays - startDays
        println("Result in days:-------------------->  $result")
        println("Result in days(Whole no):---------->  ${result.inWholeDays}")
        println("Result in hours(Whole no):--------->  ${result.inWholeHours}")
        println("Result in minutes(Whole no):------->  ${result.inWholeMinutes}")
        println("Result in seconds(Whole no):------->  ${result.inWholeSeconds}")
        println("Result in milliseconds(Whole no):-->  ${result.inWholeMilliseconds}")
        println("Result in microseconds(Whole no):-->  ${result.inWholeMicroseconds}")
        println("Result in nanoseconds(Whole no):--->  ${result.inWholeNanoseconds}")
    }

    fun handlingNegativeOutput() {
        val startDays : Duration = 9.days
        val finalDays : Duration = 10.days
        val result = startDays - finalDays
        println("Are inputs positive:--> ${startDays.isPositive() && finalDays.isPositive()}")
        println("Is result negative:--> ${result.isNegative()}")
    }

    fun combiningDifferentDurationInputs() {
        val sixDays : Duration = 6.days
        val twoHours : Duration = 2.hours
        val fiftyFiveSeconds : Duration = 55.seconds

        val result = sixDays + twoHours + fiftyFiveSeconds
        println("Result:--> $result")
        println("Result in Whole No:--> ${result.inWholeDays}")
    }

    fun measureExecutionTimeOfCodeBloc(){
        val timeTaken = measureTime {
            // Some block of code --> Starting
            Thread.sleep(5000)
            // Some block of code --> Ending
        }
        println("Result:--> $timeTaken")
    }

    fun reverseConversionFromString() {
        val input = "5d 3h 1s"
        val parseToDuration = Duration.parseOrNull(input)
        println("Result:--> ${parseToDuration?.inWholeDays}")
        val inputTwo = "5d 1s 3s"
        val parseToDurationWithError = Duration.parseOrNull(inputTwo)
        println("Result returns error:--> $parseToDurationWithError")
    }

    fun usingIsoFormat() {
        // ISO 8601
        val sixDays : Duration = 6.days
        val twoHours : Duration = 2.hours
        val fiftyFiveSeconds : Duration = 55.seconds

        println((sixDays + twoHours + fiftyFiveSeconds).toIsoString())
        println(parseIsoStringOrNull("PT823H3M"))

    }


}