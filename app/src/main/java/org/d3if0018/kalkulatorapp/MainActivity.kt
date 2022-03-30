package org.d3if0018.kalkulatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import org.d3if0018.kalkulatorapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var isNewOp = true
    var oldNumber = ""
    var op = "+"
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun numberEvent(view: View) {
        if (isNewOp)
            editText.setText("")
        isNewOp = false

        var buclick = editText.text.toString()
        var buselect = view as Button
        when (buselect.id){
            bu1.id -> {buclick += "1"}
            bu2.id -> {buclick += "2"}
            bu3.id -> {buclick += "3"}
            bu4.id -> {buclick += "4"}
            bu5.id -> {buclick += "5"}
            bu6.id -> {buclick += "6"}
            bu7.id -> {buclick += "7"}
            bu8.id -> {buclick += "8"}
            bu9.id -> {buclick += "9"}
            bu0.id -> {buclick += "0"}
            buDot.id -> {buclick += "."}
            buPlusMinus.id -> {buclick = "-$buclick"}
        }
        editText.setText(buclick)
    }

    fun operatorEvent(view: View) {
        isNewOp = true
        oldNumber = editText.text.toString()
        var buselect = view as Button
        when(buselect.id){
            buMultiply.id -> {op = "*"}
            buPlus.id -> {op = "+"}
            buMinus.id -> {op= "-"}
            buDivide.id -> {op = "/"}
        }
    }

    fun equalsEvent(view: View) {
        var newnumber = editText.text.toString()
        var result = 0.0
        when (op){
            "+" -> {result = oldNumber.toDouble() + newnumber.toDouble()}
            "*" -> {result = oldNumber.toDouble() * newnumber.toDouble()}
            "-" -> {result = oldNumber.toDouble() - newnumber.toDouble()}
            "/" -> {result = oldNumber.toDouble() / newnumber.toDouble()}
        }
        editText.setText(result.toString())
    }

    fun acEvent(view: View) {
        editText.setText("0")
        isNewOp = true
    }

    fun percentEvent(view: View) {
        var no = editText.text.toString().toDouble()/100
        editText.setText(no.toString())
        isNewOp = true
    }
}