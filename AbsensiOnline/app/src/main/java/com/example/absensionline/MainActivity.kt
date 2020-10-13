package com.example.absensionline

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val login : Button = findViewById(R.id.btnlogin)
        login.setOnClickListener(this)


    }

    override fun onClick(v: View){
        when(v.id){
            R.id.btnlogin -> {
                val inptUsername : EditText = findViewById(R.id.username)
                val inptPassword : EditText = findViewById(R.id.password)
                val user : String = inptUsername.text.toString()
                val pass : String = inptPassword.text.toString()
                if (user.equals("admin")&&pass.equals("admin")) {
                    val intent = Intent(this@MainActivity, bottom_navigator::class.java)
                    startActivity(intent)
                    finish()
                }
                else{
                    Toast.makeText(applicationContext,"Masukan Username dan Password",Toast.LENGTH_SHORT).show()
                }

            }
        }


    }

}
