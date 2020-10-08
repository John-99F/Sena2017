package com.example.senasoft2017

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ArrayAdapter
import android.widget.TextView
import androidx.appcompat.widget.AppCompatSpinner

class Registroauto : AppCompatActivity() {
    private var spinner: AppCompatSpinner? = null
    private var spinner1: AppCompatSpinner? = null
    private var spinner2: AppCompatSpinner? = null


    private var arrayAdapter: AppCompatSpinner? = null

    private var Marca = arrayOf("AUDI","FIAT","ALFA ROMEO")
    private var Color= arrayOf("AMARILLO","AZUL BEIGE","BLANCO","cCAFE","GRIS","MARRON","MORADO","NARANJA","NEGRO","ROJO","VERDE")
    private  var Ciudades= arrayOf("CARTAGO","CALI ","BOGOTA","MEDELLIN ","BARANQUILLA")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registroauto)

        spinner = findViewById(R.id.spinners)
        arrayAdapter = ArrayAdapter(applicationContext , android.R.layout.simple_list_item_1,Marca)


        spinner1=findViewById(R.id.spinners2)
        spinner2=findViewById(R.id.spinners3)




        val title=findViewById<TextView>(R.id.title)
        setSupportActionBar(findViewById(R.id.bar))

        supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_baseline_dehaze_24)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowTitleEnabled(false)

    }


    private fun ArrayAdapter(
        context: Context?,
        simpleListItem1: Int,
        marca: Array<String>
    ): AppCompatSpinner? {
        TODO("Not yet implemented")
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
