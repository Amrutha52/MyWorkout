package com.example.myworkout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.Toast
import com.example.myworkout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var binding : ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.flStart?.setOnClickListener {
            Toast.makeText(this,"Here we will start the exercise", Toast.LENGTH_SHORT).show()
        }
       // val flStartButton : FrameLayout = findViewById(R.id.flStart)

        val intent = Intent(this, ExerciseActivity::class.java)
        startActivity(intent)

    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}