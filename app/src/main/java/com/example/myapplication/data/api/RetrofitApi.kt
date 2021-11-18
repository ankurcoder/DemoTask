package com.example.myapplication.data.api

import com.example.myapplication.data.model.GetUser
import com.example.myapplication.data.model.GetUserItem
import com.example.myapplication.utils.Constants.Companion.ACCOUNT_ID
import com.example.myapplication.utils.Constants.Companion.API_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface RetrofitApi {
    @GET("driver?accountId=")
    suspend fun getUsers(
        @Query("accountId")
        accountId:String = ACCOUNT_ID,
        @Query("apikey")
        apikey:String = API_KEY
    ): Response<List<GetUserItem>>
}