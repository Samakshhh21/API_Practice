package com.sampam.apipracticeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val data=retroservice.retroInstance.postdata("title 1","body 1","72")
          data.enqueue(object :Callback<response>{
              override fun onResponse(call: Call<response>, response: Response<response>) {
                  println(response.body()?.id)
                  println(response.body()?.title)
                  println(response.body()?.body)
                  println(response.body()?.userId)
              }

              override fun onFailure(call: Call<response>, t: Throwable) {
                  println(t.message)
              }

          })
        val reqData=senddata("title2","body 2",85)
        val data1=retroservice.retroInstance.postbody(reqData)
                data1.enqueue(object :Callback<response>{
                    override fun onResponse(call: Call<response>, response: Response<response>) {
                        println(response.body())

                    }

                    override fun onFailure(call: Call<response>, t: Throwable) {
                        println(t.message)
            }

        })
        val data2=retroservice.retroInstance.patchtitle(23,"title 3")
        data2.enqueue(object :Callback<response>{
            override fun onResponse(call: Call<response>, response: Response<response>) {
                println(response.body())

            }

            override fun onFailure(call: Call<response>, t: Throwable) {
                println(t.message)
            }

        })
    }
}