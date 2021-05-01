package com.example.recylerview

import HorizontalAdapter
import VerticalAdapter
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    // adapter class object
    var adapter: HorizontalAdapter? = null
    var vadapter: VerticalAdapter? = null


    // Linear Layout Manager
    var HorizontalLayout: LinearLayoutManager? = null
    var VerticalLayout: LinearLayoutManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = HorizontalAdapter(this)
        vadapter = VerticalAdapter(this)


        HorizontalLayout = LinearLayoutManager(
            this@MainActivity,
            LinearLayoutManager.HORIZONTAL,
            false
        )
        VerticalLayout = LinearLayoutManager(
            this@MainActivity,
            LinearLayoutManager.VERTICAL,
            false
        )

        recyclerview!!.layoutManager = HorizontalLayout
        vrecyclerview!!.layoutManager = VerticalLayout

        recyclerview!!.adapter = adapter
        vrecyclerview!!.adapter = vadapter

    }

}