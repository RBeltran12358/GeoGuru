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
                title = "US States (Outline)",
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
                    quizOptions = listOf("North Dakota", "South Dakota", "Colorado", "NULL (Wyoming)")),
            ),
            difficultyRating = "Easy"
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
            ),
            difficultyRating = "Hard"
        ),
        Quiz(
            quizId = 3,
            preview = QuizPreview(
                title = "African Countries",
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
                    correctAnswer = "Ethiopia",
                    quizOptions = listOf("Eritrea", "Zimbabwe", "Botswana", "Ethiopia")),
                QuizQuestion(
                    quizQuestion = "Which country is this?",
                    image = R.drawable.malioutline,
                    correctAnswer = "Mali",
                    quizOptions = listOf("Mauritania", "Angola", "Mali", "Libya")),
                QuizQuestion(
                    quizQuestion = "Which country is this?",
                    image = R.drawable.eritreaoutline,
                    correctAnswer = "Eritrea",
                    quizOptions = listOf("Eritrea", "Djibouti", "Somalia", "Senegal")),
                QuizQuestion(
                    quizQuestion = "Which country is this?",
                    image = R.drawable.burkinafasooutline,
                    correctAnswer = "Burkina Faso",
                    quizOptions = listOf("Guinea", "Central African Republic", "Burkina Faso", "Botswana")),
            ),
            difficultyRating = "Hard"
        ),
        Quiz(
            quizId = 4,
            preview = QuizPreview(
                title = "Asian Currencies",
                image = R.drawable.asiaoutline,
                description = "See how well you know the primary currency of different asian countries!"
            ),
            quizQuestions = listOf(
                QuizQuestion(
                    quizQuestion = "Which is the primary currency of Japan?",
                    image = null,
                    correctAnswer = "JPY",
                    quizOptions = listOf("KRW", "JPY", "BDT", "INR")),
                QuizQuestion(
                    quizQuestion = "Which is the primary currency of India?",
                    image = null,
                    correctAnswer = "INR",
                    quizOptions = listOf("BDT", "INR", "KRW", "IDR")),
                QuizQuestion(
                    quizQuestion = "Which is the primary currency of Philippines?",
                    image = null,
                    correctAnswer = "PHP",
                    quizOptions = listOf("JPY", "PHP", "KRW", "SGD")),
                QuizQuestion(
                    quizQuestion = "Which is the primary currency of Cambodia?",
                    image = null,
                    correctAnswer = "KHR",
                    quizOptions = listOf("KHR", "KRW", "JPY", "BDT")),
                QuizQuestion(
                    quizQuestion = "Which is the primary currency of Korea?",
                    image = null,
                    correctAnswer = "KRW",
                    quizOptions = listOf("KPW", "JPY", "BDT", "KRW")),
            ),
            difficultyRating = "Hard"
        ),
        Quiz(
            quizId = 5,
            preview = QuizPreview(
                title = "South American Capitals",
                image = R.drawable.southamericaoutline,
                description = "See how well you know the capitals of different South American countries!"
            ),
            quizQuestions = listOf(
                QuizQuestion(
                    quizQuestion = "What is the capital of Chile?",
                    image = null,
                    correctAnswer = "Santiago",
                    quizOptions = listOf("Buenos Aires", "Santiago", "Lima", "Temuco")),
                QuizQuestion(
                    quizQuestion = "What is the capital of Bolivia?",
                    image = null,
                    correctAnswer = "La Paz",
                    quizOptions = listOf("La Paz", "Bogota", "Cochabamba", "Santa Cruz")),
                QuizQuestion(
                    quizQuestion = "What is the capital of Suriname?",
                    image = null,
                    correctAnswer = "Paramaribo",
                    quizOptions = listOf("Cayenne", "Moengo", "Georgetown", "Paramaribo")),
                QuizQuestion(
                    quizQuestion = "What is the capital of Venezuela?",
                    image = null,
                    correctAnswer = "Caracas",
                    quizOptions = listOf("Grenade", "Carupano", "Maracaibo", "Caracas")),
                QuizQuestion(
                    quizQuestion = "What is the capital of Brazil?",
                    image = null,
                    correctAnswer = "Brasilia",
                    quizOptions = listOf("Sao Paulo", "Buenos Aires", "Brasilia", "Montevideo")),
            ),
            difficultyRating = "Hard"
        ),
    )

    val quizMap = quizList.associateBy { it.quizId }

    fun getQuizById(quizId: Int): Quiz? {
        return quizMap[quizId]
    }



}
