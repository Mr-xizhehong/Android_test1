package com.examplpe.test3

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
import com.examplpe.test3.ui.theme.MyApplicationTheme

class SecondActivity : ComponentActivity() {
    val className = this::class.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("message",className +": onCreate")
        setContentView(R.layout.test3_second_layout2)

        val button4: Button = findViewById(R.id.test3_button4)
        button4.setOnClickListener {
            val intent = Intent(this,FirstActivity::class.java)
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
fun Greeting9(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview9() {
    MyApplicationTheme {
        Greeting9("Android")
    }
}