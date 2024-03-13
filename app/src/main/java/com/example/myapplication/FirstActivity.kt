package com.example.myapplication

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
import com.example.myapplication.ui.theme.MyApplicationTheme
import java.lang.Class
class FirstActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.first_layout)
        val button1:Button = findViewById(R.id.button1)
        val button2:Button = findViewById(R.id.button2)

        button1.setOnClickListener{
            val data = "Hello SecondActivity1"
            val intent = Intent(this,SecondActivity1::class.java)
            intent.putExtra("data",data)
            startActivity(intent)
        }
        button2.setOnClickListener {
            val data = "Hello SecondActivity2"
            val intent = Intent("com.example.myapplication.ACTION_START")
            intent.putExtra("data",data)
            startActivity(intent)
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("FirstActivity","FirstActivity 退出了，bye")
    }
}



@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        Greeting("Android")
    }
}
