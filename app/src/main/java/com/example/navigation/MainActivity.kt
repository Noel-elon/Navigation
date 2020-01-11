package com.example.navigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.navigation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
   // private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
       var binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        val myNavigation = this.findNavController(R.id.mynavigation)
        NavigationUI.setupActionBarWithNavController(this, myNavigation)






    }

    override fun onSupportNavigateUp(): Boolean {
        val myNav = this.findNavController(R.id.mynavigation)
        return myNav.navigateUp()
    }
}
