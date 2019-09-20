package com.jackest.swoosh.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

open class BaseActivity : AppCompatActivity() {

    val tag = "lifeCycle"

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(tag,"${javaClass.simpleName} OnCreate")
        super.onCreate(savedInstanceState)
    }
    override fun onStart() {
        Log.d(tag,"${javaClass.simpleName} OnStart")
        super.onStart()
    }
    override fun onResume() {
        Log.d(tag,"${javaClass.simpleName} OnResume")
        super.onResume()
    }
    override fun onRestart() {
        Log.d(tag,"${javaClass.simpleName} OnRestart")
        super.onRestart()
    }
    override fun onPause() {
        Log.d(tag,"${javaClass.simpleName} OnPause")
        super.onPause()
    }
    override fun onStop() {
        Log.d(tag,"${javaClass.simpleName} OnStop")
        super.onStop()
    }
}
