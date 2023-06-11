package com.example.geoguru.ui

import androidx.lifecycle.ViewModel
import com.example.geoguru.data.DataSource
import com.example.geoguru.data.QuizUiState
import com.example.geoguru.model.Quiz
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import java.time.temporal.ValueRange

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
            val wrongIndices = currState.incorrectQuestionsIndices

            val newQuiz = currState.currQuiz

            if (newQuiz != null) {
                newQuiz.quizQuestions.get(currState.currQuestionIndex).userAnswer = userResponse
            }

//            currState.currQuiz?.quizQuestions?.get(currState.currQuestionIndex)?.setUserAnswer(userResponse)

            if (currState.currQuiz?.quizQuestions?.get(currState.currQuestionIndex)?.validateAnswer(userResponse) == true){
                updatedScores[currState.currQuestionIndex] = 1
                wrongIndices.remove(currState.currQuestionIndex)
            } else {
                updatedScores[currState.currQuestionIndex] = 0
                wrongIndices.add(currState.currQuestionIndex)
            }
            currState.copy(
                scores = updatedScores,
                incorrectQuestionsIndices = wrongIndices,
                currQuiz = newQuiz
            )
        }
    }


    fun resetQuiz() {
        _uiState.value = QuizUiState()
    }
}
