package me.ao0000.feature_c

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import me.ao0000.feature_c.databinding.FragmentCBinding

class CFragment : Fragment() {

    private lateinit var binding: FragmentCBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        parentFragmentManager.setFragmentResultListener(
            "requestKey",
            viewLifecycleOwner
        ) { key, bundle ->
            val fromName = bundle.getString("fromName")
            binding.titleText.text = CFragment::class.java.simpleName + " from $fromName"
        }
    }
}