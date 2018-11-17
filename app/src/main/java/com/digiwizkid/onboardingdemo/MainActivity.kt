package com.digiwizkid.onboardingdemo

import android.os.Bundle
import android.support.v4.app.FragmentManager
import android.support.v7.app.AppCompatActivity
import com.digiwizkid.onboardingdemo.fragments.FirstFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentManager: FragmentManager = this.supportFragmentManager
        fragmentManager.beginTransaction().add(R.id.fragmentContainer, FirstFragment()).commit()
    }
}