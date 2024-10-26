package com.cloudsification.clouds

import android.animation.ArgbEvaluator
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.cloudsification.clouds.fragments.WikiFragment
import com.fridayof1995.tabanimation.SnapTabLayout


class MainActivity : AppCompatActivity() {




    val mArgbEvaluator: ArgbEvaluator = ArgbEvaluator()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // 使用自定义字体
      val  viewPager: ViewPager = findViewById<ViewPager>(R.id.viewPager)
        // 实例化三个主要的fragment界面 以及对应管理的viewpager
        val viewPagerAdapter: ViewPagerAdapter = ViewPagerAdapter(supportFragmentManager);
        viewPagerAdapter.addFragment(WikiFragment.newInstance(0))           // wiki fragment
        viewPagerAdapter.addFragment(MainFragment.newInstance(1))
        viewPagerAdapter.addFragment(MainFragment.newInstance(2))

        viewPager.adapter = viewPagerAdapter

        val numTab = intent.getIntExtra("numOfTabs", 3)

        // 设置tab bar的动画效果以及对应图标
        val tabLayout = findViewById<SnapTabLayout>(R.id.tabLayout)
        tabLayout.numOfTabs = SnapTabLayout.NumOfTabs.THREE
        tabLayout.setBackgroundCollapsed(R.drawable.tab_gradient_collapsed)
        tabLayout.setBackgroundExpanded(R.drawable.tab_gradient_expanded)

        tabLayout.smallCenterButton.setImageResource(R.drawable.pic)
        tabLayout.largeCenterButton.setImageResource(R.drawable.add0)
        tabLayout.startButton.setImageResource(R.drawable.wiki)         //  wiki icon
        tabLayout.endButton.setImageResource(R.drawable.setting)
        // 设置 图标变换的颜色
        tabLayout.setTransitionIconColors(ContextCompat.getColor(this@MainActivity, android.R.color.white)
                , ContextCompat.getColor(this@MainActivity, R.color.colorGrey))


        tabLayout.setIndicatorColor(ContextCompat.getColor(this@MainActivity, R.color.colorGrey))

        // 修改渐变颜色
        tabLayout.setVpTransitionBgColors(ContextCompat.getColor(this@MainActivity, R.color.wiki_fragment_color)
                , ContextCompat.getColor(this@MainActivity, R.color.myblue)
                , ContextCompat.getColor(this@MainActivity, R.color.setting_fragment_color))


        // 绑定viewpager 同时设定监听事件 主页面
        tabLayout.setupWithViewPager(viewPager)
        tabLayout.largeCenterButton.setOnClickListener {
            toast("Bottom Center Clicked. Show some bottom sheet.")
        }
    }



}

