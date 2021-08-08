package br.com.leandroid.data.network

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.Converter

class RetrofitFactory {
    fun getRetrofitFactory(
        okHttpClient: OkHttpClient,
        converterFactory:Converter.Factory
    ): Retrofit {
        return  Retrofit.Builder()
            .baseUrl("https://api.github.com/")
            .client(okHttpClient)
            .addConverterFactory(converterFactory)
            .build()
    }
}