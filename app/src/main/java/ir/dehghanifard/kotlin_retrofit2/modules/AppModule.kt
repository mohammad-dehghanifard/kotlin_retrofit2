package ir.dehghanifard.kotlin_retrofit2.modules

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import ir.dehghanifard.kotlin_retrofit2.backend.api.SliderApi
import ir.dehghanifard.kotlin_retrofit2.backend.repository.SliderRepository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideSliderRepository(api : SliderApi) = SliderRepository(api)
}