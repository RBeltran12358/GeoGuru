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
                title = "US States by Outline",
                image = R.drawable.americanflag,
                description = "See if you can identify US states by their shape!"
            ),
            quizQuestions = listOf(
                QuizQuestion(
                    quizQuestion = "Which state is this?",
                    image = R.drawable.virginiaoutline,
                    correctAnswer = "Virginia",
                    quizOptions = listOf("North Carolina", "Virginia", "South Carolina", "Kentucky")),
                QuizQuestion(
                    quizQuestion = "Which state is this?",
                    image = R.drawable.alabamaoutline,
                    correctAnswer = "Alabama",
                    quizOptions = listOf("Alabama", "Mississippi", "Arkansas", "New Hampshire")),
                QuizQuestion(
                    quizQuestion = "Which state is this?",
                    image = R.drawable.illinoisoutline,
                    correctAnswer = "Illinois",
                    quizOptions = listOf("Iowa", "Indiana", "Illinois", "Delaware")),
                QuizQuestion(
                    quizQuestion = "Which state is this?",
                    image = R.drawable.coloradooutline,
                    correctAnswer = "Colorado",
                    quizOptions = listOf("North Dakota", "South Dakota", "Colorado", "NULL")),
            )
        ),
        Quiz(
            quizId = 2,
            preview = QuizPreview(
                title = "European Capital Cities",
                image = R.drawable.europeoutline,
                description = "Test your knowledge on less popular European capital cities"
            ),
            quizQuestions = listOf(
                QuizQuestion(
                    quizQuestion = "What is the capital city of Belgium?",
                    image = null,
                    correctAnswer = "Brussels",
                    quizOptions = listOf("Amsterdam", "Bruges", "Brussels", "Rotterdam")
                ),
                QuizQuestion(
                    quizQuestion = "What is the capital city of Bosnia and Herzegovina?",
                    image = null,
                    correctAnswer = "Sarajevo",
                    quizOptions = listOf("Sarajevo", "Zagreb", "Tuzia", "Ljubljana")),
                QuizQuestion(
                    quizQuestion = "What is the capital city of Bulgaria?",
                    image = null,
                    correctAnswer = "Sofia",
                    quizOptions = listOf("Bucharest", "Sofia", "Belgrade", "Varna")),
                QuizQuestion(
                    quizQuestion = "What is the capital city of Czech Republic?",
                    image = null,
                    correctAnswer = "Prague",
                    quizOptions = listOf("Prague", "Brno", "Vienna", "Bratislava")),
                QuizQuestion(
                    quizQuestion = "What is the capital city of Denmark?",
                    image = null,
                    correctAnswer = "Copenhagen",
                    quizOptions = listOf("Amsterdam", "Vienna", "Gothenburg", "Copenhagen")),
                QuizQuestion(
                    quizQuestion = "What is the capital city of Estonia?",
                    image = null,
                    correctAnswer = "Tallinn",
                    quizOptions = listOf("Vilnius", "Tallinn", "Riga", "Tartu")),
                QuizQuestion(
                    quizQuestion = "What is the capital city of Finland?",
                    image = null,
                    correctAnswer = "Helsinki",
                    quizOptions = listOf("Turku", "Minsk", "Stockholm", "Helsinki")),
                QuizQuestion(
                    quizQuestion = "What is the capital city of Poland?",
                    image = null,
                    correctAnswer = "Warsaw",
                    quizOptions = listOf("Warsaw", "Krakow", "Lodz", "Minsk")),
                QuizQuestion(
                    quizQuestion = "What is the capital city of Iceland?",
                    image = null,
                    correctAnswer = "Reykjavik",
                    quizOptions = listOf("Dublin", "Akranes", "Reykjavik", "Fjardarbyggd")),
                QuizQuestion(
                    quizQuestion = "What is the capital city of Croatia?",
                    image = null,
                    correctAnswer = "Zagreb",
                    quizOptions = listOf("Split", "Zagreb", "Budapest", "Rijeka")),
            )
        ),
        Quiz(
            quizId = 3,
            preview = QuizPreview(
                title = "African Countries by Outline",
                image = R.drawable.africaoutline,
                description = "Test your knowledge of African country shapes by their outline!"
            ),
            quizQuestions = listOf(
                QuizQuestion(
                    quizQuestion = "Which country is this?",
                    image = R.drawable.cameroonoutline,
                    correctAnswer = "Cameroon",
                    quizOptions = listOf("Republic of Congo", "Cameroon", "Eritrea", "Sierra Leone")),
                QuizQuestion(
                    quizQuestion = "Which country is this?",
                    image = R.drawable.ethiopiaoutline,
                    correctAnswer = "Alabama",
                    quizOptions = listOf("Eritrea", "Zimbabwe", "Botswana", "Ethiopia")),
                QuizQuestion(
                    quizQuestion = "Which country is this?",
                    image = R.drawable.malioutline,
                    correctAnswer = "Mali",
                    quizOptions = listOf("Mauritania", "Angola", "Mali", "Libya")),
            )
        ),
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
