package com.example.test3

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.R
import com.example.test3.ui.theme.MyApplicationTheme

class FirstActivity : ComponentActivity() {
    val className = this::class.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("message",className +": onCreate")
        setContentView(R.layout.test3_first_layout)

        val button3:Button = findViewById(R.id.test3_button3)
        button3.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("message", className +": onStart");
    }

    override fun onResume() {
        super.onResume()
        Log.d("message", className +": onResume");
    }

    override fun onPause() {
        super.onPause()
        Log.d("message", className +": onPause");
    }

    override fun onStop() {
        super.onStop()
        Log.d("message", className +": onStop");
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("message", className +": onDestory");
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("message", className +": onRestart");
    }
}

@Composable
fun Greeting8(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview8() {
    MyApplicationTheme {
        Greeting8("Android")
    }
}