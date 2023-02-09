package com.example.intent_caller_fis
import android.widget.Button
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button = findViewById(R.id.button)
        val text_number:EditText=findViewById(R.id.editTextPhone)

        val intent = Intent(Intent.ACTION_CALL)

        fun call_number() {
            val intent = Intent(
                Intent.ACTION_CALL,
                Uri.parse("tel:" + text_number.text)
            )
            startActivity(intent)
        }

        button.setOnClickListener{
            if(text_number!=null)
            {
            call_number()
        }
    }
  }
}
