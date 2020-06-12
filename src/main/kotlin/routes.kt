package com.example.alpacasToDo

import com.example.alpacasToDo.controllers.TaskController
import com.example.alpacasToDo.controllers.WelcomeController
import dev.alpas.routing.RouteGroup
import dev.alpas.routing.Router

// https://alpas.dev/docs/routing
fun Router.addRoutes() = apply {
    group {
        webRoutesGroup()
    }.middlewareGroup("web")

    apiRoutes()
}

private fun RouteGroup.webRoutesGroup() {
    get("/", TaskController::index).name("welcome")
    post("/", TaskController::store).name("store")
    delete("/", TaskController::delete).name("delete")
    patch("/", TaskController::update).name("update")
}

private fun Router.apiRoutes() {
    // register API routes here
}
