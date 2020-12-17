package com.example.demo.entity

import com.fasterxml.jackson.annotation.JsonProperty

data class Response(@JsonProperty("value") val value: Int)