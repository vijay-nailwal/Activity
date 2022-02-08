package com.example.activities

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.activity.R
import com.example.util.LogUtil

class MainActivity2 : AppCompatActivity(), View.OnClickListener {

    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        LogUtil.d("")
        findViews()
    }

    override fun onStart() {
        super.onStart()
        LogUtil.d("")
    }

    override fun onResume() {
        super.onResume()
        LogUtil.d("")
    }

    override fun onPause() {
        super.onPause()
        LogUtil.d("")
    }

    override fun onStop() {
        super.onStop()
        LogUtil.d("")
    }

    override fun onDestroy() {
        super.onDestroy()
        LogUtil.d("")
    }

    override fun onRestart() {
        super.onRestart()
        LogUtil.d("")
    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)
        LogUtil.d("")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        LogUtil.d("")
    }

    private fun findViews() {
        button = findViewById(R.id.activity_main2_button)
        button.setOnClickListener(this)
        LogUtil.d("")
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.activity_main2_button) {
            val intent = Intent(this@MainActivity2, MainActivity1::class.java)
            startActivity(intent)
            LogUtil.d("")
        }
    }
}