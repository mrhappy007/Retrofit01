package com.example.retrofit01

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.api.Api
import com.example.retrofit01.config.ServerConfigCreator
import kotlinx.android.synthetic.main.activity_main.*
import timber.log.Timber

class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (BuildConfig.DEBUG) Timber.plant(Timber.DebugTree())

        Api.init(ServerConfigCreator.create())

        DateInfo(mutableListOf()).also {
            it.loadDate {
                val result = it.dateList.map { date -> date.label }
                jsonResult.text = "Json result: \n $result"
            }
        }
    }
}
