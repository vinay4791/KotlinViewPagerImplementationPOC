package com.example.vinayjohn.kotlinviewpagerimplementationpoc

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

/**
 * Created by vinayjohn on 29/03/19.
 */
class ViewPagerAdapter internal constructor(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    private val COUNT = 3

    override fun getCount(): Int = COUNT

    override fun getItem(position: Int): Fragment? {
        var fragment: Fragment? = null
        when(position){
            0 -> fragment = FirstFragment()
            1 -> fragment = SecondFragment()
            2 -> fragment = ThirdFragment()
        }
        return fragment
    }

    override fun getPageTitle(position: Int): CharSequence {
        return "Tab " + (position + 1)
    }
}