package com.example.alpacasToDo.configs

import dev.alpas.AppConfig
import dev.alpas.Environment

@Suppress("unused")
class PortConfig(env: Environment) : AppConfig(env) {
    init {
        println("*******************")
        println(env.isProduction)
    }
    override val appPort = env("PORT", 8080)
}