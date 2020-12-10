package com.example.restaurantpicker.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.restaurantpicker.R
import kotlinx.android.synthetic.main.fragment_users.view.*


class UsersFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_users,container,false)

        view.floatingActionButton.setOnClickListener{
            findNavController().navigate(R.id.action_usersFragment_to_addUserFragment)
        }
        return view
    }

}