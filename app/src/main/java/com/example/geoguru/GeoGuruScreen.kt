package com.example.geoguru

import android.content.Context
import android.content.Intent
import androidx.annotation.StringRes
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.cupcake.R
import com.example.geoguru.data.DataSource
import com.example.geoguru.data.DataSource.cities
import com.example.geoguru.ui.QuizSummaryScreen
import com.example.geoguru.ui.QuizViewModel
import com.example.geoguru.ui.SelectOptionScreen
import com.example.geoguru.ui.StartOrderScreen
import com.example.geoguru.ui.PreviewScreen

enum class GeoGuruScreen(@StringRes val title: Int) {
    Start(title = R.string.app_name),
    Preview(title = R.string.quiz_preview),
    Questions(title = R.string.quiz_questions),
    Summary(title = R.string.quiz_summary)
}

@Composable
fun GeoGuruAppBar(
    currentScreen: GeoGuruScreen,
    canNavigateBack: Boolean,
    navigateUp: () -> Unit,
    modifier: Modifier = Modifier
) {
    TopAppBar(
        title = { Text(stringResource(currentScreen.title)) },
        colors = TopAppBarDefaults.mediumTopAppBarColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer
        ),
        modifier = modifier,
        navigationIcon = {
            if (canNavigateBack) {
                IconButton(onClick = navigateUp) {
                    Icon(
                        imageVector = Icons.Filled.ArrowBack,
                        contentDescription = stringResource(R.string.back_button)
                    )
                }
            }
        }
    )
}

@Composable
fun GeoGuruApp(
    viewModel: QuizViewModel = viewModel(),
    navController: NavHostController = rememberNavController()
) {
    // Get current back stack entry
    val backStackEntry by navController.currentBackStackEntryAsState()
    // Get the name of the current screen
    val currentScreen = GeoGuruScreen.valueOf(
        backStackEntry?.destination?.route ?: GeoGuruScreen.Start.name
    )

    Scaffold(
        topBar = {
            GeoGuruAppBar(
                currentScreen = currentScreen,
                canNavigateBack = navController.previousBackStackEntry != null,
                navigateUp = { navController.navigateUp() }
            )
        }
    ) { innerPadding ->
        val uiState by viewModel.uiState.collectAsState()

        NavHost(
            navController = navController,
            startDestination = GeoGuruScreen.Start.name,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(route = GeoGuruScreen.Start.name) {
                StartOrderScreen(
                    quizOptions = DataSource.quizOptions,
                    onNextButtonClicked = {
                        viewModel.setQuiz(it)
                        navController.navigate(GeoGuruScreen.Preview.name)
                    },
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(dimensionResource(R.dimen.padding_medium))
                )
            }
            composable(route = GeoGuruScreen.Preview.name) {
                PreviewScreen(
                    quizUiState = uiState,
                    onNextButtonClicked = { navController.navigate(GeoGuruScreen.Questions.name) },
                    onCancelButtonClicked = {
                        cancelOrderAndNavigateToStart(viewModel, navController)
                    },
                    modifier = Modifier.fillMaxHeight()
                )
            }
            composable(route = GeoGuruScreen.Questions.name) {
                val context = LocalContext.current
                SelectOptionScreen(
                    onNextButtonClicked = { navController.navigate(GeoGuruScreen.Summary.name) },
                    onCancelButtonClicked = {
                        cancelOrderAndNavigateToStart(viewModel, navController)
                    },
                    options = cities.map { id -> context.resources.getString(id) },
                    onSelectionChanged = { viewModel.setQuizScore(it) },
                    modifier = Modifier.fillMaxHeight()
                )
            }
            composable(route = GeoGuruScreen.Summary.name) {
                val context = LocalContext.current
                QuizSummaryScreen(
                    quizUiState = uiState,
                    onCancelButtonClicked = {
                        cancelOrderAndNavigateToStart(viewModel, navController)
                    },
                    modifier = Modifier.fillMaxHeight()
                )
            }
        }
    }
}

private fun cancelOrderAndNavigateToStart(
    viewModel: QuizViewModel,
    navController: NavHostController
) {
    viewModel.resetOrder()
    navController.popBackStack(GeoGuruScreen.Start.name, inclusive = false)
}

private fun shareOrder(context: Context, subject: String, summary: String) {
    // Create an ACTION_SEND implicit intent with order details in the intent extras
    val intent = Intent(Intent.ACTION_SEND).apply {
        type = "text/plain"
        putExtra(Intent.EXTRA_SUBJECT, subject)
        putExtra(Intent.EXTRA_TEXT, summary)
    }
    context.startActivity(
        Intent.createChooser(
            intent,
            context.getString(R.string.new_cupcake_order)
        )
    )
}
