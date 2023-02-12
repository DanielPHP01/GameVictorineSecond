package com.example.gamevictorinesecond

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.gamevictorinesecond.databinding.ActivityQuizBinding

@Suppress("DEPRECATION")
class QuizActivity : AppCompatActivity() {
    private lateinit var binding: ActivityQuizBinding
    private lateinit var questionsLists: List<QuizList>

    private var currentQuestionPosition = 0
    private var selectedOptionByUser = ""
    private val handler = Handler()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuizBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initBank()
        setOptionClickListeners()
    }

    private fun setOptionClickListeners() {
        binding.option1.setOnClickListener { selectOption(binding.option1) }
        binding.option2.setOnClickListener { selectOption(binding.option2) }
        binding.option3.setOnClickListener { selectOption(binding.option3) }
        binding.option4.setOnClickListener { selectOption(binding.option4) }
    }

    private fun selectOption(selectedOptionButton: Button) {
        if (selectedOptionByUser.isEmpty()) {
            selectedOptionByUser = selectedOptionButton.text.toString()
            selectedOptionButton.setBackgroundResource(R.drawable.round_text_option_red)
            selectedOptionButton.setTextColor(Color.WHITE)
            if (selectedOptionByUser == questionsLists[currentQuestionPosition].answer) {
                revealAnswer()
            }
            questionsLists[currentQuestionPosition].userSelectedAnswer = selectedOptionByUser
            handler.postDelayed({ changeNextQuestion() }, 400)
        }
    }

    private fun getCorrectAnswer(): Int {
        return questionsLists.count { it.userSelectedAnswer == it.answer }
    }

    private fun getInCorrectAnswer(): Int {
        return questionsLists.count { it.userSelectedAnswer != it.answer }
    }

    @SuppressLint("SetTextI18n")
    private fun initBank() {
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

    @Deprecated(message = "Deprecated in Java", replaceWith = ReplaceWith("finish()"))
    override fun onBackPressed() {
        finish()
    }

    private fun revealAnswer() {
        val options = listOf(
            binding.option1,
            binding.option2,
            binding.option3,
            binding.option4
        )

        options.forEachIndexed { _, option ->
            if (option.text.toString() == questionsLists[currentQuestionPosition].answer) {
                option.setBackgroundResource(R.drawable.round_text_option_green)
                option.setTextColor(Color.WHITE)
            }
        }
    }

    @SuppressLint("SetTextI18n")
    private fun changeNextQuestion() {
        currentQuestionPosition++
        if (currentQuestionPosition >= questionsLists.size) {
            getMove()
            return
        }

        selectedOptionByUser = ""
        val options = listOf(
            binding.option1,
            binding.option2,
            binding.option3,
            binding.option4
        )

        options.forEach { option ->
            option.setBackgroundResource(R.drawable.round_text_option)
            option.setTextColor(Color.parseColor("#FFFFFF"))
        }

        binding.questions.text = "${currentQuestionPosition + 1}/${questionsLists.size}"
        binding.question.text = questionsLists[currentQuestionPosition].question
        binding.option1.text = questionsLists[currentQuestionPosition].option1
        binding.option2.text = questionsLists[currentQuestionPosition].option2
        binding.option3.text = questionsLists[currentQuestionPosition].option3
        binding.option4.text = questionsLists[currentQuestionPosition].option4
    }

    private fun getMove() {
        val intent = Intent(this, QuizResult::class.java)
        intent.putExtra("correct", getCorrectAnswer())
        intent.putExtra("incorrect", getInCorrectAnswer())
        this.startActivity(intent)
        finish()
    }
}