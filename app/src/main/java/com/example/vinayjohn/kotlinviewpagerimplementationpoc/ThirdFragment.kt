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
class ThirdFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.third_fragment, container, false)
        val textView = view.findViewById<TextView>(R.id.third_fragment_txt)
        textView.setText(R.string.third_fragment)
        return view
    }

}