package com.sampam.apipracticeapp
import retrofit2.Call
import retrofit2.http.*

interface retroInterface {
    @FormUrlEncoded
    @POST("posts")
    fun postdata(@Field("title")title:String,@Field("body")body:String,
        @Field("userId")userId:String):Call<response>

    @POST("posts")
    fun postbody(@Body reqdata:senddata):Call<response>

    @FormUrlEncoded
    @PATCH("posts/{id}")
    fun patchtitle(@Path("id")id:Int,@Field("title")title:String):Call<response>
}