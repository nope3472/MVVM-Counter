package eu.tutorials.mvvm

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class CounterViewModel: ViewModel() {
    private val _count= mutableIntStateOf(0)

    val count: MutableState<Int> =_count

    fun inc(){
        _count.value++
    }

    fun dec(){
        _count.value--
    }
}


