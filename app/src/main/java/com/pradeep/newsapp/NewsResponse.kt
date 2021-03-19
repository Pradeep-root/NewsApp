package com.pradeep.newsapp

data class NewsResponse(

    val articles : List<Articles>,
    val status : String,
    val totalResults: Int
)