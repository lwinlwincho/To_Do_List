package com.llc.todolist.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.llc.todolist.databinding.FragmentFirstBinding
import com.llc.todolist.viewModels.FirstViewModel

class FirstFragment : Fragment() {

    private val viewModel: FirstViewModel by viewModels()

    private var _binding: FragmentFirstBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val firstName = viewModel.firstName
        binding.tvName.text = firstName
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}