package com.example.geoguru.model

data class Quiz(
    val quizId: Int,
    val preview: QuizPreview,
    val quizQuestions: List<QuizQuestion>,
    val score: Int = 0
) {
    fun getNumberOfQuestions(): Int {
        return quizQuestions.size
    }


}
