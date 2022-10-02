package com.llc.todolist

import androidx.recyclerview.widget.RecyclerView

class ItemAdapter(private val listener: (MovieModel) -> Unit,private val delegate: Delegate) {
    fun Item(){
        this.listener(MovieModel(title = "",0))
        delegate.onClickListener(MovieModel(title = "",0))
    }
}


interface Delegate{
    fun onClickListener(model: MovieModel)
}