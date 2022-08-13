package com.example.appjamproject.Test

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.appjamproject.BabyBoomResultActivity
import com.example.appjamproject.MillenniumResultActivity
import com.example.appjamproject.R

class TestPageFragment3 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.test_page_fragment3, container, false)

        view.findViewById<Button>(R.id.previous_btn).setOnClickListener {
            fragmentManager
                ?.beginTransaction()
                ?.replace(R.id.test_fragment_container, TestPageFragment2())
                ?.commit()
        }

        view.findViewById<Button>(R.id.result_btn).setOnClickListener {
            val intent = Intent(context, BabyBoomResultActivity::class.java)
            startActivity(intent)
        }

        return view
    }
}