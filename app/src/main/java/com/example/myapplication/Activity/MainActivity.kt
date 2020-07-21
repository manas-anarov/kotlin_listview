package com.example.myapplication.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ListView
import com.example.myapplication.Adapter.ListViewModelAdapter
import com.example.myapplication.R
import com.example.myapplication.Utils.Helper

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.sample_listVw)

        var listViewAdapter = ListViewModelAdapter(this, Helper.Companion.getListViewModelList())
        listView.adapter = listViewAdapter
        listView.onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, position, id ->

    }

    }
}