package com.example.gamevictorinesecond

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.gamevictorinesecond.databinding.ActivityQuizResultBinding


@Suppress("DEPRECATION")
class QuizResult : AppCompatActivity() {

    private lateinit var binding: ActivityQuizResultBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuizResultBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val getCorrectAnswers: Int = intent.getIntExtra("correct", 0)
        val getInCorrectAnswers: Int = intent.getIntExtra("incorrect", 0)
        binding.correctAnswer.text = "Correct answers - $getCorrectAnswers"
        binding.inCorrectAnswer.text = "Incorrect answers - $getInCorrectAnswers"
        binding.startAgain.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }

    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {
        super.onBackPressed()
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }
}