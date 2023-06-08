package com.example.geoguru.model

import androidx.annotation.DrawableRes

data class QuizQuestion(
    val quizQuestion: String,
    @DrawableRes val image: Int?,
    val correctAnswer: String,
    val quizOptions: List<String>
){
    fun validateAnswer(userResponse: String): Boolean {
        return userResponse == correctAnswer
    }
}

