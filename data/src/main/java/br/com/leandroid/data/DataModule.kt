package br.com.leandroid.data

import br.com.leandroid.data.network.OkHttpFactory
import br.com.leandroid.data.network.RetrofitFactory
import okhttp3.OkHttpClient
import org.koin.dsl.module
import retrofit2.Retrofit

val dataModule = module {
    single<OkHttpClient>{
        OkHttpFactory().getOkHttpInstance(get())
    }

    single<Retrofit>{
        RetrofitFactory().getRetrofitFactoryInstance(get(),get())
    }


}