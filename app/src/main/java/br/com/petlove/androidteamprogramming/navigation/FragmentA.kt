package br.com.petlove.androidteamprogramming.navigation

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import br.com.petlove.androidteamprogramming.R
import br.com.petlove.androidteamprogramming.databinding.FragmentABinding

class FragmentA : Fragment(R.layout.fragment_a) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val binding = FragmentABinding.bind(view)
        binding.button.setOnClickListener {
            // navegar pro fragment B
        }
    }
}