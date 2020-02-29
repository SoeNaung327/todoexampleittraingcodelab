package com.ittrainingmm.ucsmwa

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_list_view.view.*

class ToDoViewHolder(item: View) : RecyclerView.ViewHolder(item) {
    fun bindData(toDoEntity: ToDoEntity) {
        itemView.tvtitle.text = toDoEntity.title
        itemView.tvdescription.text=toDoEntity.description
    }
}