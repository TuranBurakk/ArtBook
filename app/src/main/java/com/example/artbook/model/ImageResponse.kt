package com.example.artbook.model

data class ImageResponse (
    val hits : List<ImageResult> ,
    val total : Int,
    val totalhits : Int
    )