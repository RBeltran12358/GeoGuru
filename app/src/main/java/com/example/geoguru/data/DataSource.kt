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
                image = R.drawable.americanflag,
                description = "Quiz 1 Description"
            ),
            quizQuestions = listOf(
                QuizQuestion(
                    quizQuestion = "What is 1+1",
                    image = "",
                    correctAnswer = "2"),
                QuizQuestion(
                    quizQuestion = "What is 1",
                    image = "",
                    correctAnswer = "1"),
                QuizQuestion(
                    quizQuestion = "What is 10+5",
                    image = "",
                    correctAnswer = "15"),
                QuizQuestion(
                    quizQuestion = "What is hi",
                    image = "",
                    correctAnswer = "hi")
            )
        ),
        Quiz(
            quizId = 2,
            preview = QuizPreview(
                title = "Quiz 2",
                image = R.drawable.americanflag,
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
                image = R.drawable.americanflag,
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
                image = R.drawable.americanflag,
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
        ),
        Quiz(
            quizId = 5,
            preview = QuizPreview(
                title = "Quiz 5",
                image = R.drawable.americanflag,
                description = "Quiz 5 Description"
            ),
            quizQuestions = listOf(
                QuizQuestion(
                    quizQuestion = "This is quiz5, say yay",
                    image = "",
                    correctAnswer = "yay"),
                QuizQuestion(
                    quizQuestion = "What is 098",
                    image = "",
                    correctAnswer = "098"),
            )
        ),
        Quiz(
            quizId = 6,
            preview = QuizPreview(
                title = "Quiz 6",
                image = R.drawable.americanflag,
                description = "Quiz 6 Description"
            ),
            quizQuestions = listOf(
                QuizQuestion(
                    quizQuestion = "Quiz 6 works, say yee",
                    image = "",
                    correctAnswer = "yee"),
                QuizQuestion(
                    quizQuestion = "What is moo",
                    image = "",
                    correctAnswer = "moo"),
            )
        ),
    )

    val quizMap = quizList.associateBy { it.quizId }

    fun getQuizById(quizId: Int): Quiz? {
        return quizMap[quizId]
    }



}
