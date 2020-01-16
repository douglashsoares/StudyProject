package com.example.studyproject.todo_list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.studyproject.R
import kotlinx.android.synthetic.main.item_todo.view.*

class ToDoAdapter(private val toDoList: List<ToDo>) : RecyclerView.Adapter<ToDoAdapter.ToDoViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ToDoViewHolder {
        return ToDoViewHolder(LayoutInflater.from(parent.context)
                .inflate(R.layout.item_todo, parent, false))
    }

    override fun getItemCount(): Int {
        return toDoList.size
    }

    override fun onBindViewHolder(holder: ToDoViewHolder, position: Int) {
        val item = toDoList[position]

        holder.bind(item)
    }


    class ToDoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(todo: ToDo){
            itemView.txtTitulo.text = todo.title
            itemView.txtDescricao.text = todo.description
//            itemView.chkTodo.isChecked = todo.check

        }

    }
}