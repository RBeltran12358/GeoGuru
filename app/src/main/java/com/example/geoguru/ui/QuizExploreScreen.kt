package com.example.geoguru.ui

import androidx.annotation.StringRes
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.geoguru.R
import com.example.geoguru.model.Quiz
import com.example.geoguru.ui.theme.md_theme_dark_primary


@Composable
fun StartQuizScreen(
    quizOptions: List<Quiz>,
    onNextButtonClicked: (Int) -> Unit,
    modifier: Modifier = Modifier
){
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.padding_small))
        ) {
            Spacer(modifier = Modifier.height(dimensionResource(R.dimen.padding_medium)))
            Text(
                text = stringResource(R.string.explore_our_quizzes),
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.headlineLarge
            )
            Spacer(modifier = Modifier.height(dimensionResource(R.dimen.padding_small)))
        }
        Row(modifier = Modifier.weight(1f, false)) {
            LazyColumn(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(
                    dimensionResource(id = R.dimen.padding_medium))) {
                items(quizOptions) { quiz ->
                    SelectQuizButton(
                        quizTitle = quiz.getQuizTitle(),
                        numOfQuestions = quiz.getNumberOfQuestions().toString(),
                        difficultyRating = quiz.difficultyRating,
                        onClick = { onNextButtonClicked(quiz.quizId) }
                    )
                }
            }

        }
    }
}

@Composable
fun SelectQuizButton(
    quizTitle: String,
    numOfQuestions: String,
    difficultyRating: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
){

    Button(
        onClick = onClick,
        contentPadding = PaddingValues(10.dp),
        modifier = modifier
            .width(370.dp)
            .height(200.dp)
            .clip(shape = RoundedCornerShape(0.dp))
    ) {
        Column(modifier = Modifier.weight(1f, false)) {
            Text(
                text = quizTitle,
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.headlineMedium.copy(fontWeight = FontWeight.Bold)
            )
            Text(
                text = "Num of Questions: $numOfQuestions",
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.headlineSmall
            )
            Text(
                text = "Difficulty: $difficultyRating",
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.headlineSmall
            )

        }
    }
}
