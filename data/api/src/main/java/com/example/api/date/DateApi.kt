package com.example.api.date

import com.example.api.date.model.Date
import io.reactivex.Single
import retrofit2.http.GET

interface DateApi {
    @GET("/api/days")
    fun getDefaultDate(): Single<List<Date>>
}