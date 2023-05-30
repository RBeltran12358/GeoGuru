package com.example.geoguru.ui

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.geoguru.R


@Composable
fun StartQuizScreen(
    quizOptions: List<Pair<Int, Int>>,
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
                style = MaterialTheme.typography.headlineLarge
            )
            Spacer(modifier = Modifier.height(dimensionResource(R.dimen.padding_small)))
        }
        Row(modifier = Modifier.weight(1f, false)) {
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(
                    dimensionResource(id = R.dimen.padding_medium)
                )
            ) {
                quizOptions.forEach { item ->
                    SelectQuizButton(
                        labelResourceId = item.first,
                        onClick = { onNextButtonClicked(item.second) }
                    )
                    Spacer(modifier = Modifier.height(dimensionResource(R.dimen.padding_medium)))
                }
            }
        }
    }
}

@Composable
fun SelectQuizButton(
    @StringRes labelResourceId: Int,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
){
    Button(
        onClick = onClick,
        modifier = modifier
            .widthIn(min = 300.dp)
            .height(120.dp)
            .clip(shape = RoundedCornerShape(0.dp))
    ) {
        Text(stringResource(labelResourceId))
    }
}
