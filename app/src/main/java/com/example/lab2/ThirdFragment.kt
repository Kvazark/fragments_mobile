package com.example.lab2

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class ThirdFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("YeseninTag","Одинокий и пьяный, один.\n")

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("YeseninTag","Месяц рожу полощет в луже,")
        return inflater.inflate(R.layout.third_fragment,container, false)
    }



    override fun onStart() {
        super.onStart()
        Log.d("YeseninTag","С неба светит лиловый сатин.\n")
        val btn = requireActivity().findViewById<Button>(R.id.button3)
        btn.setOnClickListener {
            requireActivity().supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragment_container,FirstFragment())
                .addToBackStack(null)
                .commit()
        }
    }
}