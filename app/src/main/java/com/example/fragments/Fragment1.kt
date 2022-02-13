package com.example.fragments

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.activity.R
import com.example.util.LogUtil

class Fragment1 : Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        LogUtil.d("")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        LogUtil.d("")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_1, container, false)
        LogUtil.d("")
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        LogUtil.d("")
    }

    override fun onStart() {
        super.onStart()
        LogUtil.d("")
    }

    override fun onResume() {
        super.onResume()
        LogUtil.d("")
    }

    override fun onPause() {
        super.onPause()
        LogUtil.d("")
    }

    override fun onStop() {
        super.onStop()
        LogUtil.d("")
    }

    override fun onDestroy() {
        super.onDestroy()
        LogUtil.d("")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        LogUtil.d("")
    }

    override fun onDetach() {
        super.onDetach()
        LogUtil.d("")
    }
}