package me.ao0000.multimodulenavsample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import me.ao0000.multimodulenavsample.databinding.FragmentCBinding

class CFragment : Fragment() {

    private lateinit var binding: FragmentCBinding

    private val args by navArgs<CFragmentArgs>()

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
        binding.titleText.text = CFragment::class.java.simpleName + " from ${args.fromName}"
    }
}