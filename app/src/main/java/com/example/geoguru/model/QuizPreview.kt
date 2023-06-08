package com.example.geoguru.model

import androidx.annotation.DrawableRes

data class QuizPreview(
    val title: String,
    @DrawableRes val image: Int,
    val description: String
)
