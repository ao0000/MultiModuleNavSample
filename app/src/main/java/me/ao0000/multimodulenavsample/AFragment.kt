package me.ao0000.multimodulenavsample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import me.ao0000.multimodulenavsample.databinding.FragmentABinding

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
            val action =
                AFragmentDirections.actionAFragmentToBFragment(AFragment::class.java.simpleName)
            findNavController().navigate(action)
        }

        binding.navCButton.setOnClickListener {
            val action =
                AFragmentDirections.actionAFragmentToCFragment(AFragment::class.java.simpleName)
            findNavController().navigate(action)
        }
    }
}