package com.ittrainingmm.ucsmwa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.room.Database
import kotlinx.android.synthetic.main.activity_to_do_detail.*

class ToDoDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_to_do_detail)
        var database:AppDatabase= AppDatabase.invoke(this)

        btn_Save.setOnClickListener {
            if (!edt_title.text.isNullOrEmpty()&&!edt_description.text.isNullOrEmpty()){
                var toDoEntity=ToDoEntity(edt_title.text.toString(),edt_description.text.toString())
                database.toDoDAO().insertAll(toDoEntity)
                finish()
            }else{
                Toast.makeText(this,"This is empty",Toast.LENGTH_LONG).show()
            }

        }
    }
}
