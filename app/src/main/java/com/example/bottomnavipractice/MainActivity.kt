package com.example.bottomnavipractice

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val bottomView = findViewById<BottomNavigationView>(R.id.BottonBar)


        replaceWithFragment(User_1())

        bottomView.setOnItemSelectedListener {
            when(it.itemId){
                R.id.user1-> replaceWithFragment(User_1())
                R.id.user2-> replaceWithFragment(User_2())
                R.id.user3-> replaceWithFragment(User_3())
            }

            true
        }
    }

    private fun replaceWithFragment(fragment:Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fameLayout,fragment)
        fragmentTransaction.commit()

    }
}