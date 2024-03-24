package com.example.test4

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
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
import com.example.test4.ui.theme.MyApplicationTheme

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.test4_login_layout)
        val buttonLogin:Button = findViewById(R.id.buttonLogin)
        val buttonResister:Button = findViewById(R.id.buttonResister)
        val editTextUsername:EditText = findViewById(R.id.editTextUsername)
        val editTextPassword:EditText = findViewById(R.id.editTextPassword)
        buttonLogin.setOnClickListener {
            val username = editTextUsername.text.toString().trim()
            val password = editTextPassword.text.toString().trim()
            if (username == "admin" && password == "admin"){
                val loginIntent = Intent(this,SuccessActivity::class.java)
                loginIntent.putExtra("username",username)
                loginIntent.putExtra("password",password)
                startActivity(loginIntent)
            }
            else {
                AlertDialog.Builder(this)
                    .setTitle("Login Failed")
                    .setMessage("Incorrect username or password.")
                    .setPositiveButton("OK", null)
                    .show()
            }
        }
    }
}

@Composable
fun Greeting10(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview10() {
    MyApplicationTheme {
        Greeting10("Android")
    }
}