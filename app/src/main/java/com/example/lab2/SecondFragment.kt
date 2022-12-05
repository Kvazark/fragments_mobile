package com.example.lab2


import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class SecondFragment : Fragment() {


    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("YeseninTag","Улыбаться при встрече мне.\n")
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("YeseninTag","")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("YeseninTag","А за что? А за то, что пью я,\n")
        return inflater.inflate(R.layout.second_fragment,container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("YeseninTag","Разве можно за это ругать,\n")
    }

    override fun onStart() {
        super.onStart()
        Log.d("YeseninTag","Коль на этой на пьяной планете")
        val btn = requireActivity().findViewById<Button>(R.id.button2)
        btn.setOnClickListener {
            requireActivity().supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragment_container,ThirdFragment())
                .addToBackStack(null)
                .commit()
        }
    }

    override fun onResume() {
        super.onResume()
        Log.d("YeseninTag","Родила меня бедная мать.\n")
    }

    override fun onPause() {
        super.onPause()
        Log.d("YeseninTag","")
    }

    override fun onStop() {
        super.onStop()
        Log.d("YeseninTag","Я стою никому не нужен,\n")
    }
}