package com.example.lab4.SecondTask

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.lab4.R
import kotlinx.android.synthetic.main.fragment_list.*

class ListFragment : Fragment() {

    lateinit var mListener: OnFragmentInteractionListener

    //Метод, який викликається для відображення в фрагменті певного макету
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        // "Надуваємо" макет для цього фрагменту
        return inflater.inflate(R.layout.fragment_list, container, false)
    }


    //Отримуємо доступ до елементів UI та описуємо обробники натискань
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //Обробник кліків на кожний елемент списку
        googleTextView.setOnClickListener {
            loadUrl("https://www.google.com/")
        }

        facebookTextView.setOnClickListener {
            loadUrl("https://www.facebook.com/")
        }

        twitterTextView.setOnClickListener {
            loadUrl("https://www.twitter.com/")
        }

        xda_developerTextView.setOnClickListener {
            loadUrl("https://www.xda-developers.com/")
        }
    }

    //Створюємо екземпляр OnFragmentInteractionListener
    override fun onAttach(context: Context) {
        super.onAttach(context)
        try {
            mListener = context as OnFragmentInteractionListener
        } catch (e: ClassCastException) {
            throw ClassCastException(
                "$context должен реализовывать интерфейс OnFragmentInteractionListener"
            )
        }
    }

    //Завантаження url на інший фрагмент
    private fun loadUrl(url:String){
        mListener.onFragmentInteraction(url)
    }
}