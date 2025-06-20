package com.jackphan.mycity.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jackphan.mycity.data.model.Place
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class HomeViewModel : ViewModel() {
    private val _state = MutableStateFlow<List<Place>>(emptyList())
    val state: StateFlow<List<Place>> = _state

    init {
        // Giả lập dữ liệu
        viewModelScope.launch {
            _state.value = listOf(
                Place(1, "Công viên", "Nơi vui chơi ngoài trời", "Giải trí", ""),
                Place(2, "Chợ đêm", "Mua sắm và ẩm thực địa phương", "Mua sắm", "")
            )
        }
    }
}