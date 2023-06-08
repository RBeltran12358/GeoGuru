package com.example.geoguru.ui

import androidx.lifecycle.ViewModel
import com.example.geoguru.data.DataSource
import com.example.geoguru.data.QuizUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class QuizViewModel : ViewModel() {

//    private val _uiState = MutableStateFlow(QuizUiState(quizQuestions = quizQuestionOptions()))
    private val _uiState = MutableStateFlow(QuizUiState())
    val uiState: StateFlow<QuizUiState> = _uiState.asStateFlow()

    fun setQuiz(quizId: Int) {
        _uiState.update { currentState ->
            currentState.copy(
                currQuizId = quizId,
                currQuiz = DataSource.getQuizById(quizId)
            )
        }
    }

    fun transitionNextQuestion() {
        _uiState.update { currentState ->
            currentState.copy(
                currQuestionIndex = currentState.currQuestionIndex + 1,
            )
        }
    }

    fun setQuizScore(userResponse: String) {
        _uiState.update { currState ->
            val updatedScores = currState.scores
            if (currState.currQuiz?.quizQuestions?.get(currState.currQuestionIndex)?.validateAnswer(userResponse) == true){
                updatedScores[currState.currQuestionIndex] = 1
            } else {
                updatedScores[currState.currQuestionIndex] = 0
            }
            currState.copy(
                scores = updatedScores
            )
        }
    }


    fun resetQuiz() {
        _uiState.value = QuizUiState()
    }


//    private fun quizQuestionOptions(): List<String> {
//        val dateOptions = mutableListOf<String>()
//        val formatter = SimpleDateFormat("E MMM d", Locale.getDefault())
//        val calendar = Calendar.getInstance()
//        // add current date and the following 3 dates.
//        repeat(4) {
//            dateOptions.add(formatter.format(calendar.time))
//            calendar.add(Calendar.DATE, 1)
//        }
//        return dateOptions
//    }
}
