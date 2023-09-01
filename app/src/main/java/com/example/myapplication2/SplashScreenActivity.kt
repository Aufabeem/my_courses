package com.example.myapplication2


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler



@Suppress("DEPRECATION")
class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        Handler().postDelayed({
            //doSomethingHere()
            val goToMainActivity: Intent = Intent (this@SplashScreenActivity, MainActivity::class.java)
            startActivity(goToMainActivity)
            finish()
        }, 2000)

    }
}