package ir.dehghanifard.kotlin_retrofit2.backend.repository

import dagger.hilt.android.scopes.ActivityScoped
import ir.dehghanifard.kotlin_retrofit2.backend.Models.Slider
import ir.dehghanifard.kotlin_retrofit2.backend.api.SliderApi
import ir.dehghanifard.kotlin_retrofit2.backend.response.ServiceResponse
import javax.inject.Inject

@ActivityScoped
class SliderRepository @Inject constructor (private val api : SliderApi) {
    suspend fun fetchSlider() : ServiceResponse<Slider> {
       return try {
            api.getSlidersApi()
        }catch (e : Exception){
            ServiceResponse(message = e.message)
        }
    }
}