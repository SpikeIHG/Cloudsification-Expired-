package com.fridayof1995.sample

import android.animation.ArgbEvaluator
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.fridayof1995.tabanimation.SnapTabLayout


class MainActivity : AppCompatActivity() {




    val mArgbEvaluator: ArgbEvaluator = ArgbEvaluator()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val viewPagerAdapter: ViewPagerAdapter = ViewPagerAdapter(supportFragmentManager);
        val  viewPager = findViewById<ViewPager>(R.id.viewPager);
        viewPagerAdapter.addFragment(MainFragment.newInstance(0))
        viewPagerAdapter.addFragment(MainFragment.newInstance(1))
        viewPagerAdapter.addFragment(MainFragment.newInstance(2))

        viewPager.adapter = viewPagerAdapter

        val numTab = intent.getIntExtra("numOfTabs", 3)

        /**
         * Library methods and example usage.
         */
        val tabLayout = findViewById<SnapTabLayout>(R.id.tabLayout)
        tabLayout.numOfTabs = if (numTab.equals(SnapTabLayout.NumOfTabs.THREE.value)) {
            SnapTabLayout.NumOfTabs.THREE
        } else {
            viewPagerAdapter.addFragment(MainFragment.newInstance(3))
            viewPagerAdapter.addFragment(MainFragment.newInstance(4))
            SnapTabLayout.NumOfTabs.FIVE
        }

        tabLayout.setBackgroundCollapsed(R.drawable.tab_gradient_collapsed)
        tabLayout.setBackgroundExpanded(R.drawable.tab_gradient_expanded)

        tabLayout.smallCenterButton.setImageResource(R.drawable.ic_view_white)
        tabLayout.largeCenterButton.setImageResource(R.drawable.ic_view_white)
        tabLayout.startButton.setImageResource(R.drawable.ic_comment_white)
        tabLayout.endButton.setImageResource(R.drawable.ic_white_whatshot)
        tabLayout.midStart.setImageResource(R.drawable.ic_white_poll)
        tabLayout.midEnd.setImageResource(R.drawable.ic_white_email)

//        tabLayout.setTransitionIconColors(ContextCompat.getColor(this@MainActivity, android.R.color.white)
//                , ContextCompat.getColor(this@MainActivity, R.color.colorGrey))

        //tabLayout.setCenterScale(0.85f)

        tabLayout.setIndicatorColor(ContextCompat.getColor(this@MainActivity, R.color.colorGrey))

        tabLayout.setVpTransitionBgColors(ContextCompat.getColor(this@MainActivity, android.R.color.holo_purple)
                , ContextCompat.getColor(this@MainActivity, android.R.color.black)
                , ContextCompat.getColor(this@MainActivity, android.R.color.holo_orange_dark))

        tabLayout.smallCenterButton.setOnClickListener {
            toast("Bottom Center Clicked. Show some bottom sheet.")
        }

        tabLayout.setupWithViewPager(viewPager)
    }

}
