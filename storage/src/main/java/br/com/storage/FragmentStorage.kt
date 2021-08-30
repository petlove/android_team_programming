package br.com.storage

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import br.com.storage.databinding.FragmentStorageBinding

class FragmentStorage : Fragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val binding = FragmentStorageBinding.bind(view)
    }
}