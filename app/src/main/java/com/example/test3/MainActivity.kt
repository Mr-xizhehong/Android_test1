package com.example.test3

import android.app.Activity
import android.content.ContentValues.TAG
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

class MainActivity : ComponentActivity() {
    val className = this::class.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.test3_main_layout)
        Log.d("message", className +": onCreate");

        val button1:Button = findViewById(R.id.test3_button1)
        val button2:Button = findViewById(R.id.test3_button2)

        button1.setOnClickListener {
            val intent1 = Intent(this, NormalActivity::class.java)
            startActivity(intent1)
        }
        button2.setOnClickListener {
            val intent2 = Intent(this, DialogActivity::class.java)
            startActivity(intent2)
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
fun Greeting5(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview5() {
    MyApplicationTheme {
        Greeting5("Android")
    }
}