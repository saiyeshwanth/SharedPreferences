package com.example.android.sharedpreferences

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fManager=supportFragmentManager
        var tx=fManager.beginTransaction()
        tx.add(R.id.fragment,SigninFragment())
        tx.addToBackStack("true")
        tx.commit()
    }
}
