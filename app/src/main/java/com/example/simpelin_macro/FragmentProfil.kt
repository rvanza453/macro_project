package com.example.simpelin_macro

import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction

class FragmentProfil : Fragment(R.layout.fragment_profil) {
    companion object {
        private const val ARG_PARAM1 = "param1"
        private const val ARG_PARAM2 = "param2"

        @JvmStatic
        fun newInstance(param1: String, param2: String) = FragmentProfil().apply {
            arguments = Bundle().apply {
                putString(ARG_PARAM1, param1)
                putString(ARG_PARAM2, param2)
            }
        }
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Temukan tombol berdasarkan ID
        val btnReminder: ImageButton = view.findViewById(R.id.btn_reminder)
        val btnSetting: ImageButton = view.findViewById(R.id.btn_setting)

        // Tambahkan listener untuk menangani klik tombol
        btnReminder.setOnClickListener {
            // Buat instance FragmentInputGoals
            val FragmentReminder = FragmentReminder()

            // Mulai transaksi fragment
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()

            // Ganti fragment saat tombol diklik
            transaction.replace(R.id.fragment_container, FragmentReminder)
            transaction.addToBackStack(null) // Tambahkan fragment ke back stack

            // Jalankan transaksi fragment
            transaction.commit()
        }
        btnSetting.setOnClickListener {
            // Buat instance FragmentInputGoals
            val FragmentSetting = FragmentSetting()

            // Mulai transaksi fragment
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()

            // Ganti fragment saat tombol diklik
            transaction.replace(R.id.fragment_container, FragmentSetting)
            transaction.addToBackStack(null) // Tambahkan fragment ke back stack

            // Jalankan transaksi fragment
            transaction.commit()
        }
    }
}
