package com.example.tema

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Spinner

class ProfilProfActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activityprofilprof_main)

        val spinner: Spinner = findViewById(R.id.Meniu)

    }
}