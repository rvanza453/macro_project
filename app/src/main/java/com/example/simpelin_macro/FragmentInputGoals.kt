package com.example.simpelin_macro

import android.os.Bundle
import androidx.fragment.app.Fragment

class FragmentInputGoals : Fragment(R.layout.fragment_input_goals) {
    companion object {
        private const val ARG_PARAM1 = "param1"
        private const val ARG_PARAM2 = "param2"

        @JvmStatic
        fun newInstance(param1: String, param2: String) = FragmentInputGoals().apply {
            arguments = Bundle().apply {
                putString(ARG_PARAM1, param1)
                putString(ARG_PARAM2, param2)
            }
        }
    }
}
