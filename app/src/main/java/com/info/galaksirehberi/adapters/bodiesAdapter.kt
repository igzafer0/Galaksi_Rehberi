package com.info.galaksirehberi.adapters

import android.annotation.SuppressLint
import android.util.Log
import android.view.LayoutInflater
import android.view.View

import android.view.ViewGroup
import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.*
import com.info.galaksirehberi.R
import com.info.galaksirehberi.models.BodieModel

class bodiesAdapter(val bodies:BodieModel) : Adapter<BodiesViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BodiesViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.bodierow, parent, false)
        return BodiesViewHolder(view)
    }

    override fun onBindViewHolder(holder: BodiesViewHolder, position: Int) {
        holder.bindItems(bodies, position)
    }

    override fun getItemCount(): Int {
        Log.d("winter",bodies.bodies.size.toString())
        return bodies.bodies.size
    }

}

class BodiesViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val name: TextView = view.findViewById(R.id.name)


    fun bindItems(item: BodieModel, index: Int) {
        name.setText(item.bodies[index].name)

    }
}