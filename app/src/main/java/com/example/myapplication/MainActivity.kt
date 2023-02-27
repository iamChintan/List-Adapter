package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val adaptor = ProgrammingAdaptor()

        val p1 = ProgrammingItem(1,"J" , "Java")
        val p2 = ProgrammingItem(2,"k" , "Kotlin")
        val p3 = ProgrammingItem(3,"R" , "ReactNative")
        val p4 = ProgrammingItem(4,"A" , "Android")
        val p5 = ProgrammingItem(5,"C" , "C Sharp")

        adaptor.submitList(listOf(p1,p2,p3,p4,p5))

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = adaptor

        Handler(Looper.getMainLooper()).postDelayed({
            val p3 = ProgrammingItem(3,"R" , "ReactNative")
            val p4 = ProgrammingItem(4,"A" , "Android")
            val p5 = ProgrammingItem(5,"C" , "C Sharp")
            val p6 = ProgrammingItem(6,"D" , "Dart")
            val p7 = ProgrammingItem(7,"J" , "JavaScript")

            adaptor.submitList(listOf(p3,p4,p5,p6,p7))
        },4000)
    }
}