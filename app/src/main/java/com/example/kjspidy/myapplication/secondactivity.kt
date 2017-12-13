package com.example.kjspidy.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.kjspidy.myapplication.R.id.textViewrandom
import kotlinx.android.synthetic.main.activity_secondactivity.*
import java.util.*

class secondactivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondactivity)
        showRandomNumber()
    }

    companion object {
        const val TOTAL_COUNT = "total_count"
    }

    fun showRandomNumber() {

        val count = intent.getIntExtra(TOTAL_COUNT, 0)

        val random = Random()
        var randomInt = 0

        if (count > 0) {
            // Add one because the bound is exclusive
            randomInt = random.nextInt(count + 1)
        }

        textViewrandom.text = Integer.toString(randomInt)


        textViewlabel.text = getString(R.string.random_heading, count)
    }
}
