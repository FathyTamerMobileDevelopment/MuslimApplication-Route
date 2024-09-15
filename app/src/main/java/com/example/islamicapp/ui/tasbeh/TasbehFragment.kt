package com.example.islamicapp.ui.tasbeh

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.islamicapp.R
import com.example.islamicapp.databinding.FragmentTasbehBinding
import com.example.islamicapp.utils.hideBtnBack
import com.example.islamicapp.utils.showAppBar


class TasbehFragment : Fragment() {

    private var _binding: FragmentTasbehBinding? = null
    private val binding get() = _binding!!
    private var counter = 0 // Initialize the counter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        hideBtnBack()
        _binding = FragmentTasbehBinding.inflate(inflater, container, false)
        val view = binding.root


        binding.tvDoaa.setOnClickListener {
            counter++
            binding.tvCounter.text = counter.toString()
        }

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }



}