package com.example.senasoft2017

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun p(view: View) {
        var i= Intent(this, inicio::class.java)
        startActivity(i)
    }

    fun MiPerfil(view: View) {
        var i1= Intent(this, Miperfil::class.java)
        startActivity(i1)
    }
}