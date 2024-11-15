package tr.com.nuritiras.ogrenmebirimi4uygulama9

import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun ciftSayilar(view: View) {
        val editText = findViewById<EditText>(R.id.editTextTextMultiLine_Sayilar)
        editText.setText("")
        for (i in 1..15) {
            if (i % 2 == 0) {
                editText.setText(editText.text.toString() + i.toString() +"\n")
            }
        }
    }
    fun tekSayilar(view: View) {
        val editText = findViewById<EditText>(R.id.editTextTextMultiLine_Sayilar)
        editText.setText("")
        for (i in 1..15)
            if (i % 2 != 0) {
                editText.setText(editText.text.toString() + i.toString() +"\n")
            }
    }
    fun tumSayilar(view: View) {
        val editText = findViewById<EditText>(R.id.editTextTextMultiLine_Sayilar)
        editText.setText("")
        for (i in 1..15)
            editText.setText(editText.text.toString() + i.toString() +"\n")
    }
}