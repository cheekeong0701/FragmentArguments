package com.example.test

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavAction
import androidx.navigation.NavDirections
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.test.databinding.FragmentABinding

class AFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentABinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_a, container, false)

        binding.btnOk.setOnClickListener() {

            val personName: String = binding.tfName.text.toString()

            // val bundle = bundleOf(Pair("same", personName))

            // Navigation.findNavController(it).navigate(R.id.action_AFragment_to_BFragment)

            val action: NavDirections = AFragmentDirections.actionAFragmentToBFragment(personName)
            Navigation.findNavController(it).navigate(action)
        }
        return binding.root
    }


}