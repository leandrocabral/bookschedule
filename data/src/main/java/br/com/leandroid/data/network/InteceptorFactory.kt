package br.com.leandroid.data.network

import br.com.leandroid.data.BuildConfig
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor

internal class InteceptorFactory(){
    fun getInterceptors():List<Interceptor>{
        return arrayListOf(
            getOkHttpLogginInteceptorInstance()
        )
    }

    private fun getOkHttpLogginInteceptorInstance(): HttpLoggingInterceptor {
        return HttpLoggingInterceptor()
            .apply{
                if(BuildConfig.DEBUG){
                    level = HttpLoggingInterceptor.Level.BODY
                }
            }
    }
}