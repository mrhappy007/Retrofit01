package com.example.api

import com.example.api.date.DateApi
import com.example.api.date.DateApiCreator

object Api {
    @JvmStatic
    lateinit var date: DateApi
        private set

    @JvmStatic
    fun init(config: ServerConfig) {
        date = DateApiCreator.create(config.dateServerConfig)
    }
}