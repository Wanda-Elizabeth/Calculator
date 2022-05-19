package com.example.calculatoractivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var etNumber:EditText
    lateinit var etNumber1:EditText
    lateinit var btnAdd:Button
    lateinit var btnSubtract:Button
    lateinit var btnMultiply:Button
    lateinit var btnModulus:Button
    lateinit var tvAns:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etNumber=findViewById(R.id.etNumber)
        etNumber1=findViewById(R.id.etNumber1)
        btnAdd=findViewById(R.id.btnAdd)
        btnSubtract=findViewById(R.id.btnSubtract)
        btnMultiply=findViewById(R.id.btnMultiply)
        btnModulus=findViewById(R.id.btnModulus)
        tvAns=findViewById(R.id.tvAns)

        btnAdd.setOnClickListener {
            var ans1 = etNumber.text.toString().toInt()
            var ans2 = etNumber1.text.toString().toInt()
            Addition(ans1,ans2)
        }
        btnSubtract.setOnClickListener {
            var ans1 = etNumber.text.toString().toInt()
            var ans2 = etNumber1.text.toString().toInt()
            subtraction(ans1,ans2)
        }
        btnMultiply.setOnClickListener {
            var ans1 = etNumber.text.toString().toInt()
            var ans2 = etNumber1.text.toString().toInt()
            multiplacation(ans1,ans2)
        }
        btnModulus.setOnClickListener {
            var ans1 = etNumber.text.toString().toInt()
            var ans2 = etNumber1.text.toString().toInt()
            modulus(ans1,ans2)
        }
    }

    fun Addition(ans1:Int ,ans2:Int){
        var answer= ans1 + ans2
        tvAns.text=answer.toString()
    }

    fun subtraction(ans1:Int ,ans2:Int){
        var answer= ans1 - ans2
        tvAns.text=answer.toString()
    }


    fun multiplacation(ans1:Int ,ans2:Int){
        var answer= ans1 * ans2
        tvAns.text=answer.toString()
    }
    fun modulus(ans1:Int ,ans2:Int){
        var answer= ans1 % ans2
        tvAns.text=answer.toString()
    }




}


