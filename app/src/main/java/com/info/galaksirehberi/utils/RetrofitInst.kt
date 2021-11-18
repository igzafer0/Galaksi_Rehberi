package com.info.galaksirehberi.utils

import com.info.galaksirehberi.services.IDataBase
import com.info.galaksirehberi.utils.consts.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

abstract class RetrofitInst {
    companion object {
        private val retrofit = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()

        val retrofitInstance: IDataBase by lazy {
            retrofit.create(IDataBase::class.java)
        }
    }
}