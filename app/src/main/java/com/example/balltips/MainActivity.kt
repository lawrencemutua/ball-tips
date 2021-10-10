package com.example.balltips

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dailyTipsTextView = findViewById<TextView>(R.id.dailyTipsTextView)
        dailyTipsTextView.setOnClickListener {
            val intent = Intent(this,DailyTips::class.java)
            startActivity(intent)
        }

        val dailyComboTextView = findViewById<TextView>(R.id.dailyComboTextView)
        dailyComboTextView.setOnClickListener {
            val intent = Intent(this,DailyCombo::class.java )
            startActivity(intent)
        }

        val goalScorersTextView = findViewById<TextView>(R.id.goalScorersTextView)
        goalScorersTextView.setOnClickListener {
            val intent = Intent(this, GoalScorers::class.java)
            startActivity(intent)
        }

        val jackpotsTextView = findViewById<TextView>(R.id.JackpotsTextView)
        jackpotsTextView.setOnClickListener {
            val intent = Intent(this,Jackpots::class.java)
            startActivity(intent)
        }

        val previousVipTextView = findViewById<TextView>(R.id.previousVipTextView)
        previousVipTextView.setOnClickListener {
            val intent = Intent(this, PreviousVip::class.java)
            startActivity(intent)
        }

        val safeTipTextView = findViewById<TextView>(R.id.safeTipTextView)
        safeTipTextView.setOnClickListener {
            val intent = Intent(this, SafeTip::class.java)
            startActivity(intent)
        }

        val vipTipsTextView = findViewById<TextView>(R.id.vipTipsTextView)
        vipTipsTextView.setOnClickListener {
            val intent = Intent(this, VipTips::class.java)
            startActivity(intent)
        }

        val shareUsTextView = findViewById<TextView>(R.id.shareUsTextView)
        shareUsTextView.setOnClickListener {
            val intent = Intent()
        }



    }
}