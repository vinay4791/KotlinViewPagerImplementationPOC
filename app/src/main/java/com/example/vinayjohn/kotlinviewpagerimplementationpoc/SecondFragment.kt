package com.example.vinayjohn.kotlinviewpagerimplementationpoc

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

/**
 * Created by vinayjohn on 29/03/19.
 */
class SecondFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.second_fragment, container, false)
        val textView = view.findViewById<TextView>(R.id.second_fragment_txt)
        textView.setText(R.string.second_fragment)
        return view
    }

}

