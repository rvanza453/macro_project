package com.example.simpelin_macro

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class FragmentInput : Fragment(R.layout.fragment_input) {

    companion object {
        fun newInstance(param1: String, param2: String) = FragmentInput().apply {
            arguments = Bundle().apply {
                val ARG_PARAM1 = null
                putString(ARG_PARAM1, param1)
                val ARG_PARAM2 = null
                putString(ARG_PARAM2, param2)
            }
        }
    }
}
