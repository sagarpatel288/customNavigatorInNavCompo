package com.logicalwe.custom_navigator_in_nav_compo

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.logicalwe.custom_navigator_in_nav_compo.databinding.FragmentHomeContainerBinding

class HomeContainerFragment : Fragment() {

    private lateinit var binding: FragmentHomeContainerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("HomeContainerFragment", "onCreate")
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentHomeContainerBinding.inflate(inflater, container, false)
        return binding.root
    }
}
