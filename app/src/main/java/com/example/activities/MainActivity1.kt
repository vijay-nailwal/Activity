package com.example.activities

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.activity.R
import com.example.util.Constant
import com.example.util.LogUtil

class MainActivity1 : AppCompatActivity(), View.OnClickListener {

    private lateinit var button: Button
    private lateinit var buttonFinish: Button
    private lateinit var editText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main1)
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

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        LogUtil.d("")
        outState.putString(Constant.PUT_EXTRA_EDIT_TEXT, editText.text.toString())
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        LogUtil.d("")
        editText.setText(savedInstanceState.getString(Constant.PUT_EXTRA_EDIT_TEXT))
    }

    private fun findViews() {
        button = findViewById(R.id.activity_main1_button)
        buttonFinish = findViewById(R.id.activity_main1_button_finish)
        editText = findViewById(R.id.activity_main1_editText)
        button.setOnClickListener(this)
        buttonFinish.setOnClickListener(this)
        LogUtil.d("")
    }

    override fun onBackPressed() {
        super.onBackPressed()
        LogUtil.d("")
    }


    override fun onClick(v: View?) {
        if (v?.id == R.id.activity_main1_button) {
            val intent = Intent(this@MainActivity1, MainActivity2::class.java)
            startActivity(intent)
            LogUtil.d("")
        } else if (v?.id == R.id.activity_main1_button_finish) {
            val intent = Intent(this@MainActivity1, MainActivity2::class.java)
            startActivity(intent)
            finish()
        }
    }

}