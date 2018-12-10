package com.example.joe.weekend5googleplaces.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.joe.weekend5googleplaces.R
import com.example.joe.weekend5googleplaces.models.PlaceData
import kotlinx.android.synthetic.main.activity_main.view.*

class RecyclerViewPlaceAdapter(var placeList: List<PlaceData>): RecyclerView.Adapter<RecyclerViewPlaceAdapter.ViewHolder>() {
    lateinit var context: Context
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        context = viewGroup.context
        val view = LayoutInflater.from(context).inflate(
            R.layout.recycler_view_place, viewGroup, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = placeList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        
    }

    class ViewHolder(placeView: View): RecyclerView.ViewHolder(placeView){

    }
}