package com.example.gamevictorinesecond

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.example.gamevictorinesecond.databinding.ActivityQuizBinding

class QuizActivity : AppCompatActivity() {
    private lateinit var binding: ActivityQuizBinding
    private lateinit var questionsLists: List<QuizList>

    private var currentQuestionPosition = 0
    private var selectedOptionByUser = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuizBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initBank()
        binding.option1.setOnClickListener {
            if (selectedOptionByUser.isEmpty()) {
                selectedOptionByUser = binding.option1.text.toString()
                binding.option1.setBackgroundResource(R.drawable.round_text_option_red)
                binding.option1.setTextColor(Color.WHITE)
                if (selectedOptionByUser == questionsLists[currentQuestionPosition].answer) {
                    revealAnswer()
                }
                questionsLists[currentQuestionPosition].userSelectedAnswer = selectedOptionByUser
                Handler().postDelayed({
                    changeNextQuestions()
                }, 400)
            }
        }
        binding.option2.setOnClickListener {
            if (selectedOptionByUser.isEmpty()) {
                selectedOptionByUser = binding.option2.text.toString()
                binding.option2.setBackgroundResource(R.drawable.round_text_option_red)
                binding.option2.setTextColor(Color.WHITE)
                if (selectedOptionByUser == questionsLists[currentQuestionPosition].answer) {
                    revealAnswer()
                }
                questionsLists[currentQuestionPosition].userSelectedAnswer = selectedOptionByUser
                Handler().postDelayed({
                    changeNextQuestions()
                }, 400)
            }
        }
        binding.option3.setOnClickListener {
            if (selectedOptionByUser.isEmpty()) {
                selectedOptionByUser = binding.option3.text.toString()
                binding.option3.setBackgroundResource(R.drawable.round_text_option_red)
                binding.option3.setTextColor(Color.WHITE)
                if (selectedOptionByUser == questionsLists[currentQuestionPosition].answer) {
                    revealAnswer()
                }
                questionsLists[currentQuestionPosition].userSelectedAnswer = selectedOptionByUser
                Handler().postDelayed({
                    changeNextQuestions()
                }, 400)

            }
        }
        binding.option4.setOnClickListener {
            if (selectedOptionByUser.isEmpty()) {
                selectedOptionByUser = binding.option4.text.toString()
                binding.option4.setBackgroundResource(R.drawable.round_text_option_red)
                binding.option4.setTextColor(Color.WHITE)
                if (selectedOptionByUser == questionsLists[currentQuestionPosition].answer) {
                    revealAnswer()
                }
                questionsLists[currentQuestionPosition].userSelectedAnswer =
                    selectedOptionByUser
                Handler().postDelayed({
                    changeNextQuestions()
                }, 400)
            }
        }
    }


    private fun getCorrectAnswer(): Int {
        var correctAnswers = 0
        for (i in questionsLists.indices) {
            val getUserSelectedAnswer: String = questionsLists[i].userSelectedAnswer
            val getAnswer: String = questionsLists[i].answer
            if (getUserSelectedAnswer == getAnswer) {
                correctAnswers++
            }
        }
        return correctAnswers
    }

    private fun getInCorrectAnswer(): Int {
        var correctInAnswers = 0
        for (i in questionsLists.indices) {
            val getUserSelectedAnswer: String = questionsLists[i].userSelectedAnswer
            val getAnswer: String = questionsLists[i].answer
            if (getUserSelectedAnswer != getAnswer) {
                correctInAnswers++
            }
        }
        return correctInAnswers
    }

    @SuppressLint("SetTextI18n")
    fun initBank() {
        val selectedTopic: String? = intent.getStringExtra("selectedTopic")
        val quizBank = QuizBank()
        questionsLists = quizBank.qetQuestions(selectedTopic)!!
        binding.questions.text =
            (currentQuestionPosition + 1).toString() + "/" + questionsLists.size
        binding.question.text = questionsLists[0].question
        binding.option1.text = questionsLists[0].option1
        binding.option2.text = questionsLists[0].option2
        binding.option3.text = questionsLists[0].option3
        binding.option4.text = questionsLists[0].option4
    }

    @Deprecated("Deprecated in Java", ReplaceWith("finish()"))
    override fun onBackPressed() {
        finish()
    }

    private fun revealAnswer() {
        when (questionsLists[currentQuestionPosition].answer) {
            binding.option1.text.toString() -> {
                binding.option1.setBackgroundResource(R.drawable.round_text_option_green)
                binding.option1.setTextColor(Color.WHITE)
            }
            binding.option2.text.toString() -> {
                binding.option2.setBackgroundResource(R.drawable.round_text_option_green)
                binding.option2.setTextColor(Color.WHITE)
            }
            binding.option3.text.toString() -> {
                binding.option3.setBackgroundResource(R.drawable.round_text_option_green)
                binding.option3.setTextColor(Color.WHITE)
            }
            binding.option4.text.toString() -> {
                binding.option4.setBackgroundResource(R.drawable.round_text_option_green)
                binding.option4.setTextColor(Color.WHITE)
            }
        }
    }

    @SuppressLint("SetTextI18n")
    private fun changeNextQuestions() {
        currentQuestionPosition++
        if (currentQuestionPosition < questionsLists.size) {
            selectedOptionByUser = ""
            binding.option1.setBackgroundResource(R.drawable.round_text_option)
            binding.option1.setTextColor(Color.parseColor("#1F6BB8"))
            binding.option2.setBackgroundResource(R.drawable.round_text_option)
            binding.option2.setTextColor(Color.parseColor("#1F6BB8"))
            binding.option3.setBackgroundResource(R.drawable.round_text_option)
            binding.option3.setTextColor(Color.parseColor("#1F6BB8"))
            binding.option4.setBackgroundResource(R.drawable.round_text_option)
            binding.option4.setTextColor(Color.parseColor("#1F6BB8"))
            binding.questions.text =
                (currentQuestionPosition + 1).toString() + "/" + questionsLists.size
            binding.question.text = questionsLists[currentQuestionPosition].question
            binding.option1.text = questionsLists[currentQuestionPosition].option1
            binding.option2.text = questionsLists[currentQuestionPosition].option2
            binding.option3.text = questionsLists[currentQuestionPosition].option3
            binding.option4.text = questionsLists[currentQuestionPosition].option4
        } else {
            getMove()
        }
    }

    private fun getMove() {
        val intent = Intent(this, QuizResult::class.java)
        intent.putExtra("correct", getCorrectAnswer())
        intent.putExtra("incorrect", getInCorrectAnswer())
        this.startActivity(intent)
        finish()
    }

}
