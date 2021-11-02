package me.ao0000.feature_a

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.net.toUri
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.NavDeepLinkRequest
import androidx.navigation.fragment.findNavController
import me.ao0000.feature_a.databinding.FragmentABinding

class AFragment : Fragment() {

    private lateinit var binding: FragmentABinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentABinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.titleText.text = AFragment::class.java.simpleName

        binding.navBButton.setOnClickListener {
            parentFragmentManager.setFragmentResult(
                "requestKey",
                bundleOf("fromName" to this::class.java.simpleName)
            )
            val request = NavDeepLinkRequest.Builder
                .fromUri("android-app://example.google.app/b_fragment".toUri())
                .build()
            findNavController().navigate(request)
        }

        binding.navCButton.setOnClickListener {
            parentFragmentManager.setFragmentResult(
                "requestKey",
                bundleOf("fromName" to this::class.java.simpleName)
            )
            val request = NavDeepLinkRequest.Builder
                .fromUri("android-app://example.google.app/c_fragment".toUri())
                .build()
            findNavController().navigate(request)
        }
    }
}