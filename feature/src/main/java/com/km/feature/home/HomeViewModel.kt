package com.km.feature.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.core.data.repository.PerformanceRepository
import com.core.model.Performance
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    repository: PerformanceRepository
) : ViewModel() {
    val performances = MutableStateFlow<List<Performance>>(emptyList())

    init {
        viewModelScope.launch {
            performances.value = repository.getPerformances()
        }
    }
}