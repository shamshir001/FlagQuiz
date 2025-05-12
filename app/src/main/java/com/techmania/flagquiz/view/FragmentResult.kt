package com.techmania.flagquiz.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.techmania.flagquiz.R
import com.techmania.flagquiz.databinding.FragmentResultBinding


class FragmentResult : Fragment() {

    lateinit var fragmentResultBinding: FragmentResultBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        fragmentResultBinding = FragmentResultBinding.inflate(inflater, container, false)

        // Inflate the layout for this fragment
        fragmentResultBinding.buttonNewQuiz.setOnClickListener{

        }

        fragmentResultBinding.buttonExit.setOnClickListener{

        }

        return fragmentResultBinding.root
    }
}