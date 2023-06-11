package com.example.geoguru.model

data class Quiz(
    val quizId: Int,
    val preview: QuizPreview,
    val quizQuestions: List<QuizQuestion>,
    val score: Int = 0,
    val difficultyRating: String
) {
    fun getNumberOfQuestions(): Int {
        return quizQuestions.size
    }

    fun getQuizTitle(): String {
        return preview.title
    }
}
