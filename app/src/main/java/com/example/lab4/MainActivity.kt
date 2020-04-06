package com.example.lab4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.lab4.FirstTask.FirstTask
import com.example.lab4.SecondTask.SecondTask
import com.example.lab4.ThirdTask.ThirdTask

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClick(view: View) {
        when ((view as Button).id) {
            //Відкриває активність для завдання1. Макет з 4х фрагментів, з використання альтернативного макету компонування фрагментів
            R.id.buttonTask1 -> startActivity(Intent(this, FirstTask::class.java))
            //Відкриває активність для завдання2. Активність має 2 фрагмети. При натискані на TextView в списку у другому фрагменті відкривається фрагмент з WebView
            R.id.buttonTask2 -> startActivity(Intent(this, SecondTask::class.java))
            //Відкриває активність для завдання3. Використання віджетів ViewPager TabLayout
            R.id.buttonTask3 -> startActivity(Intent(this, ThirdTask::class.java))
        }
    }
}
