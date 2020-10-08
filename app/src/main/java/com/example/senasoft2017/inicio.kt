package com.example.senasoft2017

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toolbar
import kotlin.system.exitProcess

class inicio : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio)

        val title=findViewById<TextView>(R.id.Title)
        setSupportActionBar(findViewById(R.id.bar))

        supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_baseline_dehaze_24)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowTitleEnabled(false)

        title.text="TramiAuto"
    }
    //para ejecutar el menu
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu,menu)
        return true
    }

    //Genera acciones
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return true
    }
}