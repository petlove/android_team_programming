package br.com.logout

import android.os.Bundle
import android.view.View
import androidx.core.net.toUri
import androidx.fragment.app.Fragment
import androidx.navigation.NavDeepLinkRequest
import androidx.navigation.fragment.findNavController
import br.com.logout.databinding.FragmentLogoutBinding

class FragmentLogout : Fragment(R.layout.fragment_logout) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val binding = FragmentLogoutBinding.bind(view)
        binding.button.setOnClickListener {
            val request = NavDeepLinkRequest.Builder
                .fromUri("android-app://team.programming.app/fragment_storage".toUri())
                .build()
            findNavController().navigate(request)
        }
    }
}