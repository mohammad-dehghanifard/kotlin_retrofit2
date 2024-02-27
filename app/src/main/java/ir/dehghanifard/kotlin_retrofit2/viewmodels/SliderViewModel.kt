package ir.dehghanifard.kotlin_retrofit2.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import ir.dehghanifard.kotlin_retrofit2.backend.Models.Slider
import ir.dehghanifard.kotlin_retrofit2.backend.repository.SliderRepository
import ir.dehghanifard.kotlin_retrofit2.backend.response.ServiceResponse
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SliderViewModel @Inject constructor(private val repository: SliderRepository) : ViewModel() {

    fun getSliders(onSuccess : (response : ServiceResponse<Slider>) -> Unit) {
        viewModelScope.launch {
            val data = repository.fetchSlider()
            onSuccess(data)
        }
    }

}