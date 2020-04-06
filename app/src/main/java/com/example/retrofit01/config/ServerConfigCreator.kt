package com.example.retrofit01.config

import com.example.api.ServerConfig
import com.example.api.date.DateServerConfig

object ServerConfigCreator {
    @JvmStatic
    fun create() = ServerConfig(
        dateServerConfig = DateServerConfig(
            baseUrl = "https://5e85eab844467600161c6a5c.mockapi.io",
            clientInfo = "hello world"
        )
    )
}
