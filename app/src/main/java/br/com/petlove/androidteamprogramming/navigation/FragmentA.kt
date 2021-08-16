package br.com.petlove.androidteamprogramming.navigation

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import br.com.petlove.androidteamprogramming.R
import br.com.petlove.androidteamprogramming.databinding.FragmentABinding

class FragmentA : Fragment(R.layout.fragment_a) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val binding = FragmentABinding.bind(view)
        binding.button.setOnClickListener {
            view.findNavController().navigate(R.id.action_fragmentA_to_fragmentB)
        }
    }
}