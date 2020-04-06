package com.example.lab4.ThirdTask


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.lab4.R
import kotlinx.android.synthetic.main.fragment_task3.*

@Suppress("DEPRECATION")
class FragmentThree : Fragment() {

    //Метод, який викликається для відображення в фрагменті певного макету
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        // "Надуваємо" макет для цього фрагменту
        return inflater.inflate(R.layout.fragment_task3, container, false)
    }

    //Отримуємо доступ до елементів UI та змінюємо дані
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        //Завантаження картинки в ImageView на фрагмент
        imageView.setImageResource(R.drawable.fragmnet_three)
        //Зміна кольору фону
        view.setBackgroundColor(getResources().getColor(R.color.colorFragmentThree))
    }
}