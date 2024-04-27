package tuan3

import android.os.Bundle
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.R

class T3ListviewMainActivity : AppCompatActivity() {
    var adapter: T3Adapter? = null
    var ls=ArrayList<T3contact>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_t3_listview_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var lv=findViewById<ListView>(R.id.t3Listview)
        ls.add(T3contact("Nguyen Van A","20", R.drawable.app))
        ls.add(T3contact("Nguyen Van B","20", R.drawable.app2))
        ls.add(T3contact("Nguyen Van C","20", R.drawable.app3))
        ls.add(T3contact("Nguyen Van D","20", R.drawable.app4))
        ls.add(T3contact("Nguyen Van E","20", R.drawable.app5))
        ls.add(T3contact("Nguyen Van F","20", R.drawable.app6))
        ls.add(T3contact("Nguyen Van G","20", R.drawable.app7))
        ls.add(T3contact("Nguyen Van H","20", R.drawable.app8))
        adapter= T3Adapter(ls,this)
        lv!!.adapter=adapter
    }
}