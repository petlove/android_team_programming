package br.com.logout

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import br.com.logout.databinding.FragmentLogoutBinding

class FragmentLogout : Fragment(R.layout.fragment_logout) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val binding = FragmentLogoutBinding.bind(view)
//        binding.button.setOnClickListener {
//
//        }
    }
}