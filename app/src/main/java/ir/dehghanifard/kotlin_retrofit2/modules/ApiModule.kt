package ir.dehghanifard.kotlin_retrofit2.modules

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import ir.dehghanifard.kotlin_retrofit2.config.getUnsafeOkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
@InstallIn(SingletonComponent::class)
object ApiModule {
    fun provideRetrofit() : Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://onlineshop.holosen.net:9090")
            .client(getUnsafeOkHttpClient().build())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}