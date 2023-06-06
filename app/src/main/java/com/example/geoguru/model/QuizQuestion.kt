package com.example.geoguru.model

data class QuizQuestion(
    val quizQuestion: String,
    val image: String,
    val correctAnswer: String,
){
    fun validateAnswer(userResponse: String): Boolean {
        return userResponse == correctAnswer
    }
}

