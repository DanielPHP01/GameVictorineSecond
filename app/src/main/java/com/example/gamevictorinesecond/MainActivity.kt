package com.example.gamevictorinesecond

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.gamevictorinesecond.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var selectedTopic = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tennisLayout.setOnClickListener {
            selectedTopic = "tennis"
            navigateToQuizActivity()
        }
        binding.footballLayout.setOnClickListener {
            selectedTopic = "football"
            navigateToQuizActivity()
        }
        binding.basketballLayout.setOnClickListener {
            selectedTopic = "basketball"
            navigateToQuizActivity()
        }
        binding.volleyballLayout.setOnClickListener {
            selectedTopic = "volleyball"
            navigateToQuizActivity()
        }
    }

    private fun navigateToQuizActivity() {
        val intent = Intent(this, QuizActivity::class.java)
        intent.putExtra("selectedTopic", selectedTopic)
        startActivity(intent)
    }
}