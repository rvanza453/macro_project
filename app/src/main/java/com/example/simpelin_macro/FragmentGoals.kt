import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import androidx.fragment.app.FragmentTransaction
import com.example.simpelin_macro.FragmentInput
import com.example.simpelin_macro.FragmentInputGoals
import com.example.simpelin_macro.R

class FragmentGoals : Fragment(R.layout.fragment_goals) {

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

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Temukan tombol berdasarkan ID
        val btnGoals: ImageButton = view.findViewById(R.id.btn_Goals)

        // Tambahkan listener untuk menangani klik tombol
        btnGoals.setOnClickListener {
            // Buat instance FragmentInputGoals
            val fragmentInputGoals = FragmentInputGoals()

            // Mulai transaksi fragment
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()

            // Ganti fragment saat tombol diklik
            transaction.replace(R.id.fragment_container, fragmentInputGoals)
            transaction.addToBackStack(null) // Tambahkan fragment ke back stack

            // Jalankan transaksi fragment
            transaction.commit()
        }
    }
}
