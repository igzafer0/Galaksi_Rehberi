package com.info.galaksirehberi.services

import com.info.galaksirehberi.models.BodieModel
import retrofit2.http.GET

interface IDataBase {
    @GET("rest/bodies")
    suspend fun getBodies():BodieModel
}