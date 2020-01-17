package com.example.studyproject.todo_list

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.studyproject.R
import kotlinx.android.synthetic.main.activity_to_do_list.*

class ToDoListActivity : AppCompatActivity() {

    lateinit var toDoAdapter: ToDoAdapter

    val todoList = ArrayList<ToDo>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_to_do_list)

    }

    override fun onStart() {
        super.onStart()

        configureRecyclerView()

        btnAdd.setOnClickListener {
            AddToDoBottomSheet { toDo ->

                todoList.add(toDo)

                toDoAdapter.notifyDataSetChanged()

            }.show(supportFragmentManager, "AddTodo")
        }


    }

    private fun configureRecyclerView() {
        toDoAdapter = ToDoAdapter(todoList)

        val layoutManager = LinearLayoutManager(this)
        todoListRecyclerView.layoutManager = layoutManager

        todoListRecyclerView.adapter = toDoAdapter
    }
}
