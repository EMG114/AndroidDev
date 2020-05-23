package com.ericagutierrez.timefighter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    internal var score = 0
    internal var gameStarted = false
    internal lateinit var countDownTimer: CountDownTimer
    internal lateinit var tapMeButton: Button
    internal var initialCountDown: Long = 60000
    internal var countDownInterval: Long = 1000
    internal lateinit var gameScoreTextView: TextView
    internal lateinit var timeLeftTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        gameScoreTextView= findViewById(R.id.gameScoreTextView)
        tapMeButton = findViewById(R.id.tapMeButton)
        timeLeftTextView = findViewById(R.id.timeLeftTextView)

    tapMeButton.setOnClickListener{ view ->
        incrementScore()

    }

        gameScoreTextView.text = getString(R.string.yourScore, score)
    }

    private fun resetGame() {
        score = 0
        gameScoreTextView.text = getString(R.string.yourScore,
    }

    private fun incrementScore() {
        score += 1
        var newScore = getString(R.string.yourScore, score)
        gameScoreTextView.text = newScore
    }
}
