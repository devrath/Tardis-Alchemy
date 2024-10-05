package com.istudio.code.modules.api_datetime

import android.util.Log
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime
import java.time.Month

const val tag_name = "DATE TIME API DEMO"


class DateTimeApiModule {

    /**
     * This is useful if you want to get a date value locally in the device and use it locally
     * Ex: In a App that involves only Date like birthday.
     */
    fun localDate() {

        val date = LocalDate.now()
        val fullFormResult = "Full Form:--> $date"
        val year = "year:--> ${date.year}"
        val monthValue = "month:--> ${date.monthValue}"
        val dayOfMonth = "dayOfMonth:--> ${date.dayOfMonth}"
        val dayOfYear = "dayOfYear:--> ${date.dayOfYear}"
        val dayOfWeek = "dayOfWeek:--> ${date.dayOfWeek}"
        val month = "month:--> ${date.month}"

        val modifiedYear = "Modified Year:--> ${date.plusYears(5)}"
        val modifiedMonth = "Modified Year:--> ${date.plusMonths(1)}"
        val modifiedWeek = "Modified Year:--> ${date.plusWeeks(2)}"

        val constructDate = "Constructed Date:--> ${LocalDate.of(2024 ,10 ,5 )}"

        Log.d(tag_name, fullFormResult) // -----------> 2024-10-05
        Log.d(tag_name, year) // ---------------------> 2024
        Log.d(tag_name, monthValue) // ---------------> 10
        Log.d(tag_name, dayOfMonth) // ---------------> 5
        Log.d(tag_name, dayOfYear) // ----------------> 279
        Log.d(tag_name, dayOfWeek) // ----------------> SATURDAY
        Log.d(tag_name, month) // --------------------> OCTOBER
        Log.d(tag_name, "<--------------------------------->")
        Log.d(tag_name, modifiedYear) // -------------> 2029-10-05
        Log.d(tag_name, modifiedMonth) // ------------> 2024-11-05
        Log.d(tag_name, modifiedWeek) // -------------> 2024-10-19
        Log.d(tag_name, "<--------------------------------->")
        Log.d(tag_name, constructDate) // -------------> 2024-10-05
    }

    /**
     * This is useful if you want to get a date value locally in the device and use it locally
     * Ex: In a App that involves only time like calculating the duration of a task
     */
    fun localTime() {
        val time = LocalTime.now()
        val result = "Result:--> $time"
        Log.d(tag_name, result) // 12:35:04.426
    }

    /**
     * This is useful if you want to get a date value locally in the device and use it locally
     * Ex: If we are displaying the alert for a birthday using the calender
     */
    fun localDateTime() {
        // This is useful if you want to get a date value locally in the device and use it locally
        val dateTime = LocalDateTime.now()
        val result = "Result:--> $dateTime"
        Log.d(tag_name, result) // 2024-10-05T12:37:53.247
    }


}