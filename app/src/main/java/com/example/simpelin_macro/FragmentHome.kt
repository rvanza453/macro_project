package com.example.simpelin_macro

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.fragment.app.FragmentTransaction

class FragmentHome : Fragment(R.layout.fragment_home) {

    companion object {
        fun newInstance(param1: String, param2: String) = FragmentHome().apply {
            arguments = Bundle().apply {
                val ARG_PARAM1 = null
                putString(ARG_PARAM1, param1)
                val ARG_PARAM2 = null
                putString(ARG_PARAM2, param2)
            }
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Temukan tombol berdasarkan ID
        val btnNotification: ImageButton = view.findViewById(R.id.btn_notification)

        // Tambahkan listener untuk menangani klik tombol
        btnNotification.setOnClickListener {
            // Buat instance FragmentInputGoals
            val FragmentNotification = FragmentNotification()

            // Mulai transaksi fragment
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()

            // Ganti fragment saat tombol diklik
            transaction.replace(R.id.fragment_container, FragmentNotification)
            transaction.addToBackStack(null) // Tambahkan fragment ke back stack

            // Jalankan transaksi fragment
            transaction.commit()
        }
    }
}
