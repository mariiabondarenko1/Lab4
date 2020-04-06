package com.example.lab4.SecondTask

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.lab4.R
import kotlinx.android.synthetic.main.fragment_webview.*

class WebViewFragment : Fragment() {

    //Метод, який викликається для відображення в фрагменті певного макету
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        // "Надуваємо" макет для цього фрагменту
        return inflater.inflate(R.layout.fragment_webview, container, false)
    }

    //Метод, ща завантажує URL
    fun loadUrl(url: String){
        webView.loadUrl(url)
    }
}