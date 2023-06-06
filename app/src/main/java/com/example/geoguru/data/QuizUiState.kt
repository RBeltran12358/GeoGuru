package com.example.geoguru.data

import com.example.geoguru.model.Quiz

data class QuizUiState(
    val currQuizId: Int = 0,
    val currQuiz: Quiz? = null,
    var currQuestionIndex: Int = 0,
    var scores: IntArray = IntArray(20){0}
) {
    fun incrementQuestionIndex(): Unit {
        currQuestionIndex++
    }
}
