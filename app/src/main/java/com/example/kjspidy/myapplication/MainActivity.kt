package com.example.kjspidy.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var count=0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun toastme(view: View)
    {
    val mytoast=Toast.makeText(this,"Hi Kunal Jain",Toast.LENGTH_SHORT)
        mytoast.show()
    }

    fun countme(view: View)
    {
        count++;
        textView2.text = count.toString()
    }

    fun randomme(view: View)
    {
        var secondintent = Intent(this,secondactivity::class.java)

        val countString = textView2.text.toString()

        // Convert the count to an int
        val count = Integer.parseInt(countString)

        // Add the count to the extras for the Intent.
        secondintent.putExtra(secondactivity.TOTAL_COUNT, count)

        startActivity(secondintent)
    }
}
