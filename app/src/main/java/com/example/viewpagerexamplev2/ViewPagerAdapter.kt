package com.example.viewpagerexamplev2

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(val items: ArrayList<Fragment>, activity: AppCompatActivity): FragmentStateAdapter(activity) {
    override fun getItemCount(): Int = items.size

    override fun createFragment(position: Int): Fragment {
        return items[position]
    }
}