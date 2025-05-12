package com.techmania.flagquiz.view

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.techmania.flagquiz.R
import com.techmania.flagquiz.database.FlagsDao
import com.techmania.flagquiz.databinding.FragmentQuizBinding
import com.techmania.flagquiz.model.FlagsModel
import com.techmania.flagquizwithsqlitedemo.DatabaseCopyHelper


class FragmentQuiz : Fragment(){

    lateinit var fragmentQuizBinding: FragmentQuizBinding
    var flagList = ArrayList<FlagsModel>()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentQuizBinding = FragmentQuizBinding.inflate(inflater, container,false)

        val dao = FlagsDao()
        flagList =  dao.getRandomTenRecords(DatabaseCopyHelper(requireActivity()))

        for(flag in flagList){
            Log.d("flags", flag.id.toString())
            Log.d("flags", flag.countryName)
            Log.d("flags", flag.flagName)
            Log.d("flags","*******************************")

        }

        fragmentQuizBinding.buttonA.setOnClickListener{

        }

        fragmentQuizBinding.buttonB.setOnClickListener{

        }

        fragmentQuizBinding.buttonC.setOnClickListener{

        }

        fragmentQuizBinding.buttonD.setOnClickListener{

        }

        fragmentQuizBinding.buttonNext.setOnClickListener{

        }

        // Inflate the layout for this fragment

        return fragmentQuizBinding.root
    }
}