package com.example.myapplication

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val button2 = findViewById<Button>(R.id.button2)
        val nameEditText3 = findViewById<EditText>(R.id.editTextTextPersonName3)
        val nameEditText4 = findViewById<EditText>(R.id.editTextTextPersonName4)

        button2.setOnClickListener {

            intent?.extras?.let {

                val name3 = nameEditText3.text.toString()
                val name4 = nameEditText4.text.toString()

                val value1 = it.getInt("Key1")
                val textView1 = findViewById<TextView>(R.id.textView4)
                textView1.text = value1.toString()
                val value2 = it.getString("Key2")


                val bundle = Bundle()
                bundle.putString("Key3", name3)
                bundle.putString("Key1", name4)
                val intent = Intent().putExtras(bundle)
                setResult(Activity.RESULT_OK, intent.putExtras(bundle))
                finish()//結束自己週期
            }
        }
    }




}