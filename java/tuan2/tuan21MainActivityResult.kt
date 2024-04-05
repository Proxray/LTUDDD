package tuan2

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.R

class tuan21MainActivityResult : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tuan21_main_result)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var tvKQ=findViewById<TextView>(R.id.tuan2tvKQ)
        val i1=intent
        val so1= (i1.extras!!.getString("so1"))!!.toFloat()
        val so2= (i1.extras!!.getString("so2"))!!.toFloat()
         val tong= so1 + so2
        tvKQ!!.text=tong.toString()

    }
}