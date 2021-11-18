package com.info.galaksirehberi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.info.galaksirehberi.adapters.bodiesAdapter
import com.info.galaksirehberi.viewModels.bodieViewModel
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProviders.of(this).get(bodieViewModel::class.java)

        CoroutineScope(Dispatchers.IO).launch {
            viewModel.getData()
        }

        Log.d("winter","dfs")
        viewModel.bodies.observe(this, Observer {
            recyMain.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
            recyMain.adapter = bodiesAdapter(it)
        })
    }
    private lateinit var viewModel: bodieViewModel
}