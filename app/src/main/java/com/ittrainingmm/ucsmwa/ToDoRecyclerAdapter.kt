package com.ittrainingmm.ucsmwa

import android.content.Context
import android.content.Entity
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import java.security.AccessControlContext

class ToDoRecyclerAdapter(var context:Context) : RecyclerView.Adapter<ToDoViewHolder>() {
    var datalist: List<ToDoEntity> = listOf()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ToDoViewHolder {
        return ToDoViewHolder(LayoutInflater.from(context).inflate(R.layout.item_list_view,parent,false))

    }



    override fun getItemCount(): Int {
        return datalist.size
    }

    override fun onBindViewHolder(holder: ToDoViewHolder, position: Int) {
        holder.bindData(datalist.get(position))
    }

    fun setData(listdata : List<ToDoEntity>){
        datalist=listdata
    }
}