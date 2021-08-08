package br.com.leandroid.data.network

import okhttp3.OkHttpClient
import java.util.concurrent.TimeUnit

internal class OkHttpFactory {
    fun getOkHttpInstance(inteceptorFactory: InteceptorFactory):OkHttpClient{
        return OkHttpClient()
            .newBuilder().apply {
                inteceptorFactory.getInterceptors().forEach{
                    addInterceptor(it)
                }
            }
            .callTimeout(60,TimeUnit.SECONDS)
            .readTimeout(60,TimeUnit.SECONDS)
            .writeTimeout(60,TimeUnit.SECONDS)
            .build()
    }
}