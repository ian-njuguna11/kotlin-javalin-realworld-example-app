package io.realworld.app.web.controllers

import io.javalin.Context
import io.realworld.app.domain.TagDTO

class TagController {

    fun get(ctx: Context): TagDTO {
        return TagDTO(listOf(" "))
    }

}