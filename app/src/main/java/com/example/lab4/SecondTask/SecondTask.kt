package com.example.lab4.SecondTask

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lab4.R

class SecondTask: AppCompatActivity(), OnFragmentInteractionListener  {


    //Метод для обробки натискання TextView в списку макету fragment_list
    override fun onFragmentInteraction(url: String) {
        //Управління фрагментов
        val fragment = supportFragmentManager
            .findFragmentById(R.id.webViewFragment) as WebViewFragment  //Викликаємо метод в WebViewFragment, щоб завантажити URL
        if (fragment.isInLayout) {
            fragment.loadUrl(url)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task2)
    }

}