package com.example.navigation


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.navigation.databinding.FragmentTitleBinding

/**
 * A simple [Fragment] subclass.
 */
class TitleFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //Inflating the fragment XML... also using databinding
val binding : FragmentTitleBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_title, container, false)

        binding.Titlebutton.setOnClickListener { view: View ->
            Navigation.findNavController(view).navigate(R.id.action_titleFragment_to_twoFragment)
        }
        //or we could use .....setOnClickListener(Navigation.createNavigateOnclickListener(R.id.........))
        return  binding.root



        }
    }



