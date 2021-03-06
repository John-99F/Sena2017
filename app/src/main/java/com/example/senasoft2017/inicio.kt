package com.example.senasoft2017

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.view.MenuItem
import android.widget.TextView
import android.widget.Toast
import android.widget.Toolbar
import androidx.appcompat.app.ActionBar
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity
import androidx.core.view.GravityCompat
import kotlinx.android.synthetic.main.activity_inicio.*


class inicio : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio)

        bar("Activiy First")
        init()

    }
    fun bar(title: String){
     setSupportActionBar(toolbar)

        var b:ActionBar? =supportActionBar

        if(b !=null){
            b.setHomeAsUpIndicator(R.drawable.ic_baseline_dehaze_24)
            b.setDisplayHomeAsUpEnabled(true)
            b.title=title
        }
    }

    fun init(){
        nav.setNavigationItemSelectedListener {item->
            when(item.itemId){
                R.id.inicio->{
                        val i= Intent(this, inicio::class.java)
                        startActivity(i) }
                R.id.miPerfil->{
                var i= Intent(this, Miperfil::class.java)
                startActivity(i)}
                R.id.acerca->{
            Toast.makeText(this,"Acerca",Toast.LENGTH_LONG).show()}
                R.id.servicios->{
                    var i= Intent(this, servicios::class.java)
                    startActivity(i)
                }
                R.id.registro->{
                    Toast.makeText(this,"Habilitado muy pronto",Toast.LENGTH_LONG).show()
                }
                R.id.salir->{
                    Toast.makeText(this,"Saliendo...",Toast.LENGTH_LONG).show()
                }


            }
            false
        }

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            android.R.id.home->
                drawerl1.openDrawer(GravityCompat.START)
        }
        return super.onOptionsItemSelected(item)
    }


}

