package com.app.newsapp.retrofitapi

import com.app.newsapp.model.NewsResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApiService {
    // Search by user
    @GET("everything")
    fun searchNews(
        @Query("q") query: String,
        @Query("apiKey") apiKey: String = "88530eb076b84c81bdf14e3e6ea52bf3"
    ): Call<NewsResponse>
}