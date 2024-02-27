package ir.dehghanifard.kotlin_retrofit2.backend.api

import ir.dehghanifard.kotlin_retrofit2.backend.Models.Slider
import ir.dehghanifard.kotlin_retrofit2.backend.response.ServiceResponse
import retrofit2.http.GET

interface SliderApi {
    @GET("/api/slider")
    suspend fun getSlidersApi() : ServiceResponse<Slider>
}