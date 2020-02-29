package com.ittrainingmm.ucsmwa

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var database:AppDatabase= AppDatabase.invoke(this)

        var adapter: ToDoRecyclerAdapter = ToDoRecyclerAdapter(this)
        rvtodo.layoutManager = LinearLayoutManager(this)
        rvtodo.adapter = adapter
        var todolist=database.toDoDAO().getAll()

        adapter.setData(todolist)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbaritem, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
    when(item.itemId){
        R.id.actionapp->{
            var intent:Intent=Intent(this,ToDoDetailActivity::class.java)
            Toast.makeText(this,"You click me", Toast.LENGTH_SHORT).show()
            startActivity(intent)
        }
    }
        return super.onOptionsItemSelected(item)
    }
}
