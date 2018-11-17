package com.digiwizkid.onboardingdemo.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.digiwizkid.onboardingdemo.R
import kotlinx.android.synthetic.main.fragment_first.*

class FirstFragment : Fragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        firstImg.animate().translationYBy(400f)

        firstText.animate().scaleX(1.5f).scaleX(1.5f)

        first_next_btn.setOnClickListener {
            fragmentManager!!.beginTransaction().replace(R.id.fragmentContainer, SecondFragment()).commit()
        }
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }
}