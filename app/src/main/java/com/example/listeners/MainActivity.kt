package com.example.listeners

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.graphics.Color
import android.text.Editable
import android.text.TextWatcher
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val boton = findViewById<Button>(R.id.button)
        val edText = findViewById<EditText>(R.id.editText)
        val batman = findViewById<ImageView>(R.id.imageView)

       boton.setOnClickListener {
          if(edText.visibility==View.VISIBLE) {
              boton.text="FINALIZAR"
              edText.visibility = View.VISIBLE
          }else{
              boton.text="COMENZAR"
              edText.visibility = View.VISIBLE
          }
       }
        edText.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }

            override fun afterTextChanged(s: Editable?) {
                s?.let {
                    if (it.contains("Wayne")) {
                        batman.visibility = View.VISIBLE
                    }else if(it.contains("Joker")){
                        boton.setBackgroundColor(Color.MAGENTA)
                        boton.setTextColor(Color.GREEN)
                        edText.setTextColor(Color.GREEN)
                        edText.setTextColor(Color.YELLOW)
                    }
                }
            }
        })
        /*
        if(edText.text.toString()=="Wayne"){
            batman.visibility = View.VISIBLE
        }
        if(edText.text.toString()=="Joker"){
            boton.setBackgroundColor(Color.MAGENTA)
            boton.setTextColor(Color.GREEN)
            edText.setTextColor(Color.GREEN)
            edText.setTextColor(Color.YELLOW)
        }
         */
    }

}