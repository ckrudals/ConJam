package com.km.feature.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.core.model.Performance
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.ui.Alignment
import coil.compose.AsyncImage

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
    LazyVerticalGrid(
        columns = androidx.compose.foundation.lazy.grid.GridCells.Fixed(2),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        items(items = performances, key = { it.id }) {
            Column(
                horizontalAlignment =  Alignment.CenterHorizontally
            ) {
                AsyncImage(
                    model = it.poster,
                    contentDescription = null,
                )
                Text(text = it.title)
            }
        }
    }
}