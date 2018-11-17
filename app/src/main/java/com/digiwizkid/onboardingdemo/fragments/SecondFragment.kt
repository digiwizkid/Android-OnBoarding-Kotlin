package com.digiwizkid.onboardingdemo.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.digiwizkid.onboardingdemo.R
import kotlinx.android.synthetic.main.fragment_second.*

class SecondFragment : Fragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        second_prev_btn.setOnClickListener {
            fragmentManager!!.beginTransaction().replace(R.id.fragmentContainer, FirstFragment()).commit()
        }

        second_finish_btn.setOnClickListener {
            Toast.makeText(context, "Finished", Toast.LENGTH_SHORT).show()
            activity!!.finish()
        }

        super.onViewCreated(view, savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }
}