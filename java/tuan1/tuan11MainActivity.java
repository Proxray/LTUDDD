package tuan1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.myapplication.R;

public class tuan11MainActivity extends AppCompatActivity {
    //khaibao control
    EditText txt1,txt2;
    Button btn1;
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        txt1=findViewById(R.id.demo11txt11);
        txt2=findViewById(R.id.demo11txt12);
        btn1=findViewById(R.id.demo11btn11);
        tv1=findViewById(R.id.demo11tv1);
        btn1.setOnClickListener(v -> {
            tinhTong();
        });


        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tuan11_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

    }
    private void tinhTong(){


        String str1=txt1.getText().toString();
        float so1=Float.parseFloat(str1);
        String str2=txt2.getText().toString();
        float so2=Float.parseFloat(str2);
        float tong= so1 + so2;
        tv1.setText(String.valueOf(tong));
    }
}