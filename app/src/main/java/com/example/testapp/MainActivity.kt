package com.example.testapp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.anothermodule.Calculator
import com.example.submodule.ScientificCalculator

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()

        // call a method in module 1 (another module)
        val module1Result = Calculator().add(11, 22).toString()
        println("module1Result = $module1Result")
        assert(module1Result == "33")

        // call a method in module 2 (submodule)
        val module2Result = ScientificCalculator().squareRoot(16.0).toString()
        println("module2Result = $module2Result")
        assert(module2Result == "4.0")

        Toast.makeText(this, "Success!", Toast.LENGTH_SHORT).show()
    }
}