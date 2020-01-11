package com.example.navigation


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.navigation.databinding.FragmentTwoBinding

/**
 * A simple [Fragment] subclass.
 */
class Fragment_two : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
val binding : FragmentTwoBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_two, container, false)
        return binding.root
        }
    }



