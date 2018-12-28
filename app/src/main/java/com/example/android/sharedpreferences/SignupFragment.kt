package com.example.android.sharedpreferences

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import kotlinx.android.synthetic.main.signin.view.*
import kotlinx.android.synthetic.main.signup.view.*
import java.util.*

class SignupFragment:Fragment(){
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val v = inflater.inflate(R.layout.signup, container, false)

        




 v.next.setOnClickListener {
val fManager=activity!!.supportFragmentManager
     val tx=fManager.beginTransaction()
     tx.replace(R.id.fragment,SigninFragment())
     tx.addToBackStack("true")
     tx.commit()
 }
        return v

    }
}