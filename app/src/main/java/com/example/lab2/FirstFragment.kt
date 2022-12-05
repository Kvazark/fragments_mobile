package com.example.lab2


import androidx.fragment.app.Fragment
import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class FirstFragment : Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("YeseninTag","Месяц рожу полощет в луже,\n")
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("YeseninTag","С неба светит лиловый сатин.\n")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("YeseninTag","Я стою никому не нужен,\n")
        return inflater.inflate(R.layout.first_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("YeseninTag","Одинокий и пьяный, один.\n")
    }

    override fun onStart() {
        super.onStart()
        Log.d("YeseninTag","")
        val btn = requireActivity().findViewById<Button>(R.id.button1)
        btn.setOnClickListener {
            requireActivity().supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragment_container,SecondFragment())
                .addToBackStack(null)
                .commit()
        }
    }

    override fun onResume() {
        super.onResume()
        Log.d("YeseninTag","А хорошего в жизни мало,\n")
    }

    override fun onPause() {
        super.onPause()
        Log.d("YeseninTag","Боль не тонет в проклятом вине,\n")
    }

    override fun onStop() {
        super.onStop()
        Log.d("YeseninTag","Даже та, что любил, перестала\n")
    }
}