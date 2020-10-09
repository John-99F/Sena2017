package com.example.senasoft2017

import android.content.ContentValues
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import com.example.myaplication2.AdminSQLiteOpenHelper
import kotlinx.android.synthetic.main.activity_inicio.*
import kotlinx.android.synthetic.main.activity_miperfil.*
import kotlinx.android.synthetic.main.activity_miperfil.nav


class Miperfil : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_miperfil)

        var id=findViewById<EditText>(R.id.numero)
        var Nom=findViewById<EditText>(R.id.nombre)
        var Nacimiento=findViewById<EditText>(R.id.fechaNa)
        var Correos=findViewById<EditText>(R.id.Correo)
        var Expedicionlicencia=findViewById<TextView>(R.id.Vencimiento)
        bar("Mi Perfil")
        init()

button2.setOnClickListener {
    val admin = AdminSQLiteOpenHelper(this, "senasof", null, 3)
    val bd = admin.writableDatabase
    val fila = bd.rawQuery("select *from Usuarios where id=${id.text}",null)
    if (fila.moveToFirst()) {
        val registro = ContentValues()
        registro.put("Nombres", Nom.getText().toString())
        registro.put("FechaNacimiento", Nacimiento.getText().toString())
        registro.put("Correo", Correos.getText().toString())
        registro.put("Vecimienlicencia", Expedicionlicencia.getText().toString())
        val cant = bd.update("Usuarios", registro, "id=${id.text.toString()}", null)
        bd.close()
        if (cant == 1){
            Toast.makeText(this, "Registro Actualizado", Toast.LENGTH_SHORT).show()
        }
    } else {
        val registro = ContentValues()
        registro.put("id", id.getText().toString())
        registro.put("Nombres", Nom.getText().toString())
        registro.put("FechaNacimiento", Nacimiento.getText().toString())
        registro.put("Correo", Correos.getText().toString())
        registro.put("Vecimienlicencia", Expedicionlicencia.getText().toString())
        bd.insert("Usuarios", null, registro)
        bd.close()
        id.setText("")
        Nom.setText("")
        Nacimiento.setText("")
        Correos.setText("")
        Expedicionlicencia.setText("")
        Toast.makeText(this, "“NUEVO REGISTRO GUARDADO” ", Toast.LENGTH_SHORT).show()

}
    }
    }
    fun bar(title: String){
        setSupportActionBar(bar)

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
                drawerl.openDrawer(GravityCompat.START)
        }
        return super.onOptionsItemSelected(item)
    }


    }










