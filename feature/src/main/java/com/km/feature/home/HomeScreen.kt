package com.km.feature.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.core.model.Performance

@Composable
fun HomeScreen(
    viewModel: HomeViewModel = viewModel()
) {
    val performances = viewModel.performances.collectAsState()

    HomeScreen(performances = performances.value)
}

@Composable
fun HomeScreen(
    performances: List<Performance>
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        performances.forEach {
            Text(text = it.title)
        }
    }
}