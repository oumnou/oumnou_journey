package com.example.tabbedappportfolio.fragments


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.tabbedappportfolio.R


class FragmentFour: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?): View? =
        inflater!!.inflate(R.layout.todo_list, container, false)


    companion object {
        fun newInstance(): FragmentFour = FragmentFour()
    }
}