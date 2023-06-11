package com.example.geoguru.model

import androidx.annotation.DrawableRes

data class QuizQuestion(
    val quizQuestion: String,
    @DrawableRes val image: Int?,
    val correctAnswer: String,
    var userAnswer: String = "",
    val quizOptions: List<String>
){
    fun validateAnswer(userResponse: String): Boolean {
        return userResponse == correctAnswer
    }

//    fun setUserAnswer(ans: String, int: Int): Unit {
//        userAnswer = ans
//    }

}

