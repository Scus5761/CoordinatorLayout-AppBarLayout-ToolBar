package com.practice.scus.mycoordinatelayout

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.Window
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.activity_main)
        initView()
        fab_floatactionbutton.setOnClickListener {
            Snackbar.make(it, "Hello,i'm SnackBar", Snackbar.LENGTH_LONG).setText("神奇的CoordinatorLayout")
                    .setAction("确认", object : View.OnClickListener {
                        override fun onClick(v: View?) {
                            Toast.makeText(this@MainActivity, "SnackBar", Toast.LENGTH_SHORT).show()
                        }
                    })
                    .show()

        }
    }

    private fun initView() {
        tb_toolbar.setNavigationIcon(android.R.drawable.ic_dialog_info)
        tb_toolbar.setNavigationOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                Toast.makeText(this@MainActivity, "我是NavigationIcon", Toast.LENGTH_LONG).show()
            }
        })
        setSupportActionBar(tb_toolbar)
    }


}
