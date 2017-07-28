package com.jimmy.firstkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {

    var items: List<String> = ArrayList<String>()
//    MutableList 才可以使用add方法添加元素
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    fun initView() {
        items = listOf(
                "Mon 6/23 - Sunny - 31/17",
                "Tue 6/24 - Foggy - 21/8",
                "Wed 6/25 - Cloudy - 22/17",
                "Thurs 6/26 - Rainy - 18/11",
                "Fri 6/27 - Foggy - 21/10",
                "Sat 6/28 - TRAPPED IN WEATHERSTATION - 23/18",
                "Sun 6/29 - Sunny - 20/7"
        )


        forecast_list.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        forecast_list.adapter = ForecastAdapter(items,this)
    }


    override fun onResume() {
        super.onResume()
toast("onResume")
    }
}
