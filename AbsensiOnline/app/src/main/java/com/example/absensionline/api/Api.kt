package com.example.absensionline.api

import retrofit2.Call
import retrofit2.http.GET


interface Api {
    @GET("android_register_login")
    fun getPosts(): Call<ArrayList<PostResponse>>

}