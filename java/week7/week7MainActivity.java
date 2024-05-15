package week7;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.myapplication.R;

public class week7MainActivity extends AppCompatActivity {
    TextView tvKQ;
    Button btn;
    Context context=this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_week7_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    btn=findViewById(R.id.btnGet1);
    tvKQ=findViewById(R.id.tvKQ1);
    btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            VolleyFn fn=new VolleyFn();
            fn.getAllDataFromAPI(context,tvKQ);
        }
    });
    }
}