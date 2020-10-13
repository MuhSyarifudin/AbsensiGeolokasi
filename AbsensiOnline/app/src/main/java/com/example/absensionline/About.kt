package com.example.absensionline

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_about.*

class About : AppCompatActivity(), View.OnClickListener, AdapterView.OnItemSelectedListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        // Enables Always-on

        val spinner: Spinner = findViewById(R.id.spinner_tahun)
        val arrayAdapter = ArrayAdapter.createFromResource(this,R.array.fidget_tahun,android.R.layout.simple_spinner_item)
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter
        spinner.onItemSelectedListener


        val logout: Button = findViewById(R.id.btnlogout)
        logout.setOnClickListener(this)

        val edit: Button = findViewById(R.id.edit_button)
        edit.setOnClickListener {
            when (edit.id) {
                R.id.edit_button -> {
                    val intent = Intent(this, EditProfileActivity::class.java)
                    startActivity(intent)
                }
            }
        }
    }



    override fun onClick(v: View) {
        when (v.id) {
            R.id.btnlogout -> {
                val moveIntent = Intent(this@About, MainActivity::class.java)
                startActivity(moveIntent)
                finish()
            }
        }
    }

    override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, p3: Long) {
        val text: String = parent.getItemAtPosition(position).toString()
        Toast.makeText(parent.getContext(),text, Toast.LENGTH_SHORT).show()
    }

    override fun onNothingSelected(p0: AdapterView<*>?) {
        TODO("Not yet implemented")
    }
}
