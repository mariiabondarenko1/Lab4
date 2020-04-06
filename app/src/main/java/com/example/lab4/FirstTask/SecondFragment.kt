package com.example.lab4.FirstTask

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lab4.R

class SecondFragment : Fragment() {

    //Метод, який викликається для відображення в фрагменті певного макету
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // "Надуваємо" макет для цього фрагменту
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

}
