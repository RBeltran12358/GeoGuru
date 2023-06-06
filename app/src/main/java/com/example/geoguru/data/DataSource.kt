package com.example.geoguru.data

import com.example.geoguru.R
import com.example.geoguru.model.Quiz
import com.example.geoguru.model.QuizPreview
import com.example.geoguru.model.QuizQuestion

object DataSource {
    val cities = listOf(
        R.string.sacramento,
        R.string.los_angeles,
        R.string.monterey,
        R.string.salinas,
    )

    val quizOptions = listOf(
        Pair(R.string.quiz_one, 1),
        Pair(R.string.quiz_two, 2),
        Pair(R.string.quiz_three, 3)
    )

    val quizList = listOf(
        Quiz(
            quizId = 1,
            preview = QuizPreview(
                title = "Quiz 1",
                image = "",
                description = "Quiz 1 Description"
            ),
            quizQuestions = listOf(
                QuizQuestion(
                    quizQuestion = "What is 1+1",
                    image = "",
                    correctAnswer = "2"),
                QuizQuestion(
                    quizQuestion = "What is 10+5",
                    image = "",
                    correctAnswer = "15"),
            )
        ),
        Quiz(
            quizId = 2,
            preview = QuizPreview(
                title = "Quiz 2",
                image = "",
                description = "Quiz 2 Description"
            ),
            quizQuestions = listOf(
                QuizQuestion(
                    quizQuestion = "What is 10/2",
                    image = "",
                    correctAnswer = "5"),
                QuizQuestion(
                    quizQuestion = "What is 4 * 5",
                    image = "",
                    correctAnswer = "20"),
            )
        ),
        Quiz(
            quizId = 3,
            preview = QuizPreview(
                title = "Quiz 3",
                image = "",
                description = "Quiz 3 Description"
            ),
            quizQuestions = listOf(
                QuizQuestion(
                    quizQuestion = "What is 30",
                    image = "",
                    correctAnswer = "30"),
                QuizQuestion(
                    quizQuestion = "What is 9",
                    image = "",
                    correctAnswer = "9"),
            )
        ),
        Quiz(
            quizId = 4,
            preview = QuizPreview(
                title = "Quiz 4",
                image = "",
                description = "Quiz 4 Description"
            ),
            quizQuestions = listOf(
                QuizQuestion(
                    quizQuestion = "What is cow",
                    image = "",
                    correctAnswer = "cow"),
                QuizQuestion(
                    quizQuestion = "What is 3",
                    image = "",
                    correctAnswer = "3"),
            )
        )
    )
}
