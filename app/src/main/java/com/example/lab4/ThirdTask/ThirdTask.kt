package com.example.lab4.ThirdTask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import com.example.lab4.R
import com.google.android.material.tabs.TabLayout




class ThirdTask: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task3)

        //Отримуємо посилання на елементи ViewPager та TabLayout
        val pager: ViewPager = findViewById(R.id.viewPager)
        val tabs: TabLayout = findViewById(R.id.tabLayout)

        val adapter = MyViewPagerAdapter(supportFragmentManager) //Адаптер постачає віджету фрагменти
        //Додавання фрагментів до списку фрагментів адаптера
        adapter.addFragment(FragmentOne(),"Tab 1")
        adapter.addFragment(FragmentTwo(),"Tab 2")
        adapter.addFragment(FragmentThree(),"Tab 3")
        pager.adapter = adapter //Присвоення елементу новго адаптера
        tabs.setupWithViewPager(pager) //Налаштування спільного використання ViewPager та TabLayout


    }

    //Клас адаптеру для управління фрагментами
    @Suppress("DEPRECATION")
    class MyViewPagerAdapter(manager: FragmentManager) : FragmentPagerAdapter(manager){

        //Список з фрагментів
        private val fragmentList : MutableList<Fragment> = ArrayList()
        //Список з заголовків фрагментів(для TabLayout)
        private val titleList : MutableList<String> = ArrayList()

        //Повертає обєкт і-то фрагменту
        override fun getItem(position: Int): Fragment {
            return fragmentList[position]
        }
        //Повертає кількість фрагментів
        override fun getCount(): Int {
            return fragmentList.size
        }
        //Метод додавання фрагментыв до списку фрагментів адаптеру
        fun addFragment(fragment: Fragment,title:String){
            fragmentList.add(fragment)
            titleList.add(title)
        }
        //Повертає заголовок фрагменту
        override fun getPageTitle(position: Int): CharSequence? {
            return titleList[position]
        }
    }
}