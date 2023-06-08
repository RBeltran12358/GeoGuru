package com.example.geoguru.data

import com.example.geoguru.R
import com.example.geoguru.model.Quiz
import com.example.geoguru.model.QuizPreview
import com.example.geoguru.model.QuizQuestion

object DataSource {
    val quizOptions = listOf(
        "1",
        "2",
        "3",
        "4",
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
                    quizQuestion = "What is 1",
                    image = "",
                    correctAnswer = "1",
                    quizOptions = quizOptions
                ),
                QuizQuestion(
                    quizQuestion = "What is 2",
                    image = "",
                    correctAnswer = "2",
                    quizOptions),
                QuizQuestion(
                    quizQuestion = "What is 3",
                    image = "",
                    correctAnswer = "3",
                    quizOptions),
                QuizQuestion(
                    quizQuestion = "What is 4",
                    image = "",
                    correctAnswer = "4",
                    quizOptions)
            )
        ),
        Quiz(
            quizId = 2,
            preview = QuizPreview(
                title = "European Capital Cities",
                image = R.drawable.americanflag,
                description = "Test your knowledge on less popular European capital cities"
            ),
            quizQuestions = listOf(
                QuizQuestion(
                    quizQuestion = "What is the capital city of Belgium?",
                    image = "",
                    correctAnswer = "Brussels",
                    quizOptions = listOf("Amsterdam", "Bruges", "Brussels", "Rotterdam")
                ),
                QuizQuestion(
                    quizQuestion = "What is the capital city of Bosnia and Herzegovina?",
                    image = "",
                    correctAnswer = "Sarajevo",
                    quizOptions = listOf("Sarajevo", "Zagreb", "Tuzia", "Ljubljana")),
                QuizQuestion(
                    quizQuestion = "What is the capital city of Bulgaria?",
                    image = "",
                    correctAnswer = "Sofia",
                    quizOptions = listOf("Bucharest", "Sofia", "Belgrade", "Varna")),
                QuizQuestion(
                    quizQuestion = "What is the capital city of Czech Republic?",
                    image = "",
                    correctAnswer = "Prague",
                    quizOptions = listOf("Prague", "Brno", "Vienna", "Bratislava")),
                QuizQuestion(
                    quizQuestion = "What is the capital city of Denmark?",
                    image = "",
                    correctAnswer = "Copenhagen",
                    quizOptions = listOf("Amsterdam", "Vienna", "Gothenburg", "Copenhagen")),
                QuizQuestion(
                    quizQuestion = "What is the capital city of Estonia?",
                    image = "",
                    correctAnswer = "Tallinn",
                    quizOptions = listOf("Vilnius", "Tallinn", "Riga", "Tartu")),
                QuizQuestion(
                    quizQuestion = "What is the capital city of Finland?",
                    image = "",
                    correctAnswer = "Helsinki",
                    quizOptions = listOf("Turku", "Minsk", "Stockholm", "Helsinki")),
                QuizQuestion(
                    quizQuestion = "What is the capital city of Greenland?",
                    image = "",
                    correctAnswer = "Nuuk",
                    quizOptions = listOf("Nuuk", "Reykjavik", "Oslo", "Akranes")),
                QuizQuestion(
                    quizQuestion = "What is the capital city of Iceland?",
                    image = "",
                    correctAnswer = "Reykjavik",
                    quizOptions = listOf("Dublin", "Akranes", "Reykjavik", "Fjardarbyggd")),
                QuizQuestion(
                    quizQuestion = "What is the capital city of Croatia?",
                    image = "",
                    correctAnswer = "Zagreb",
                    quizOptions = listOf("Split", "Zagreb", "Budapest", "Rijeka")),
            )
        ),
//        Quiz(
//            quizId = 3,
//            preview = QuizPreview(
//                title = "Quiz 3",
//                image = R.drawable.americanflag,
//                description = "Quiz 3 Description"
//            ),
//            quizQuestions = listOf(
//                QuizQuestion(
//                    quizQuestion = "What is 30",
//                    image = "",
//                    correctAnswer = "30"),
//                QuizQuestion(
//                    quizQuestion = "What is 9",
//                    image = "",
//                    correctAnswer = "9"),
//            )
//        ),
//        Quiz(
//            quizId = 4,
//            preview = QuizPreview(
//                title = "Quiz 4",
//                image = R.drawable.americanflag,
//                description = "Quiz 4 Description"
//            ),
//            quizQuestions = listOf(
//                QuizQuestion(
//                    quizQuestion = "What is cow",
//                    image = "",
//                    correctAnswer = "cow"),
//                QuizQuestion(
//                    quizQuestion = "What is 3",
//                    image = "",
//                    correctAnswer = "3"),
//            )
//        ),
//        Quiz(
//            quizId = 5,
//            preview = QuizPreview(
//                title = "Quiz 5",
//                image = R.drawable.americanflag,
//                description = "Quiz 5 Description"
//            ),
//            quizQuestions = listOf(
//                QuizQuestion(
//                    quizQuestion = "This is quiz5, say yay",
//                    image = "",
//                    correctAnswer = "yay"),
//                QuizQuestion(
//                    quizQuestion = "What is 098",
//                    image = "",
//                    correctAnswer = "098"),
//            )
//        ),
//        Quiz(
//            quizId = 6,
//            preview = QuizPreview(
//                title = "Quiz 6",
//                image = R.drawable.americanflag,
//                description = "Quiz 6 Description"
//            ),
//            quizQuestions = listOf(
//                QuizQuestion(
//                    quizQuestion = "Quiz 6 works, say yee",
//                    image = "",
//                    correctAnswer = "yee"),
//                QuizQuestion(
//                    quizQuestion = "What is moo",
//                    image = "",
//                    correctAnswer = "moo"),
//            )
//        ),
    )

    val quizMap = quizList.associateBy { it.quizId }

    fun getQuizById(quizId: Int): Quiz? {
        return quizMap[quizId]
    }



}
