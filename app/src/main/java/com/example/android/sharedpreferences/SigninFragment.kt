package com.example.android.sharedpreferences

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.signin.view.*

class SigninFragment:Fragment(){
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val v =inflater.inflate(R.layout.signin,container,false)

        v.signup.setOnClickListener {
            val fManager=activity!!.supportFragmentManager
            val tx=fManager.beginTransaction()
            tx.replace(R.id.fragment,SignupFragment())
            tx.addToBackStack("true")
            tx.commit()
        }
        return v
        }
    }