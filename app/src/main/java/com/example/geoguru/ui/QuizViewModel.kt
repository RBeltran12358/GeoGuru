package com.example.geoguru.ui

import androidx.lifecycle.ViewModel
import com.example.geoguru.data.QuizUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale

class QuizViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(QuizUiState(quizExampleOptions = quizQuestionOptions()))
    val uiState: StateFlow<QuizUiState> = _uiState.asStateFlow()

    fun setQuiz(quizId: Int) {
        _uiState.update { currentState ->
            currentState.copy(
                quiz_id = quizId
            )
        }
    }

    fun setQuizScore(userResponse: String) {
        _uiState.update { currentState ->
            print(userResponse)
            currentState.copy(
                score = if (userResponse == "Sacramento") 1 else 0
            )
        }
    }

    fun resetQuiz() {
        _uiState.value = QuizUiState(quizExampleOptions = quizQuestionOptions())
    }


    private fun quizQuestionOptions(): List<String> {
        val dateOptions = mutableListOf<String>()
        val formatter = SimpleDateFormat("E MMM d", Locale.getDefault())
        val calendar = Calendar.getInstance()
        // add current date and the following 3 dates.
        repeat(4) {
            dateOptions.add(formatter.format(calendar.time))
            calendar.add(Calendar.DATE, 1)
        }
        return dateOptions
    }
}
