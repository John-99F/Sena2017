package com.example.senasoft2017

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.TextView

class Miperfil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_miperfil)

        val title=findViewById<TextView>(R.id.title)
        setSupportActionBar(findViewById(R.id.bar))

        supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_baseline_dehaze_24)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowTitleEnabled(false)

        title.text="Mi Perfil"
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

    fun g(view: View) {
        var i= Intent(this, Registroauto::class.java)
        startActivity(i)

    }

}