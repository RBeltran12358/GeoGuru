
package com.example.geoguru.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.geoguru.R
import com.example.geoguru.data.QuizUiState

@Composable
fun QuizSummaryScreen(
    quizUiState: QuizUiState,
    onCancelButtonClicked: () -> Unit,
    modifier: Modifier = Modifier
){

    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Column(
            modifier = Modifier.padding(dimensionResource(R.dimen.padding_medium)),
            verticalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.padding_small))
        ) {
            Text(
                text = stringResource(R.string.summary_thank_you),
                style = MaterialTheme.typography.headlineLarge
            )
            Divider(
                thickness = dimensionResource(R.dimen.thickness_divider),
                modifier = Modifier.padding(bottom = dimensionResource(R.dimen.padding_medium))
            )
            Text("Quiz Title".uppercase(), fontWeight = FontWeight.Bold)
            quizUiState.currQuiz?.let { Text(text = it.getQuizTitle()) }
            Divider(thickness = dimensionResource(R.dimen.thickness_divider), color = Color(0xFF95F6D3))

            Text("Total Number of Questions".uppercase(),  fontWeight = FontWeight.Bold)
            quizUiState.currQuiz?.let { Text(text = it.getNumberOfQuestions().toString()) }
            Divider(thickness = dimensionResource(R.dimen.thickness_divider), color = Color(0xFF95F6D3))

            Text("Total Answered Correctly".uppercase(),  fontWeight = FontWeight.Bold)
            quizUiState.scores?.let { Text(text = it.sum().toString()) }
            Divider(thickness = dimensionResource(R.dimen.thickness_divider), color = Color(0xFF95F6D3))
            Spacer(modifier = Modifier.height(dimensionResource(R.dimen.padding_small)))

            OutlinedButton(
                modifier = Modifier.fillMaxWidth(),
                onClick = onCancelButtonClicked
            ) {
                Text(stringResource(R.string.cancel))
            }

            Text(
                text = "Let's See What You Got Wrong",
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.headlineMedium
            )
            LazyColumn(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(
                    dimensionResource(id = R.dimen.padding_medium))) {

                items(quizUiState.incorrectQuestionsIndices) { index ->
                    IncorrectQuestionCard(quizUiState = quizUiState, index = index)
                }
            }
        }
    }
    
}

@Composable
fun IncorrectQuestionCard(quizUiState: QuizUiState, index: Int, modifier: Modifier = Modifier) {
    Card(modifier = Modifier.padding(8.dp)) {
        quizUiState.currQuiz?.quizQuestions?.get(index)?.let {
            Column() {
                Text(
                    text = "Quiz Question: "+ it.quizQuestion,
                    Modifier.padding(5.dp)
                )
                Divider(thickness = dimensionResource(R.dimen.thickness_divider), color = Color(0xFF95F6D3))

                Text(
                    text = "You Answered: " + it.userAnswer,
                    Modifier.padding(5.dp)
                )
                Divider(thickness = dimensionResource(R.dimen.thickness_divider), color = Color(0xFF95F6D3))

                Text(
                    text = "Correct Answer: " + it.correctAnswer,
                    Modifier.padding(5.dp)
                )
            }
        }
        Divider(thickness = dimensionResource(R.dimen.thickness_divider))
    }
}