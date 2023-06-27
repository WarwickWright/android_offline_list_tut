package com.WarwickWestonWright.EmptyViewsActivity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.WarwickWestonWright.EmptyViewsActivity.listFragments.BountyFragment

class MainActivity : AppCompatActivity() {

    private val fm = supportFragmentManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            fm.beginTransaction().setReorderingAllowed(true).replace(R.id.myListFragContainer, BountyFragment(), "BountyFragment").commit()
        }
    }

}