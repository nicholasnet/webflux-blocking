package com.example.demo.controller

import com.fasterxml.jackson.annotation.JsonProperty
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class IndexController {
    @GetMapping
    suspend fun getIndex(): Response {
        return Response(1)
    }
}

data class Response(@JsonProperty("value") val value: Int)