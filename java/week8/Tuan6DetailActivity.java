package week8;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.myapplication.R;
import com.squareup.picasso.Picasso;

public class Tuan6DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tuan6_detail);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Intent intent=getIntent();
        Product product=intent.getParcelableExtra("PRODUCT");
        ImageView imgPro=findViewById(R.id.tuan6detailImg);
        TextView tvStyleIdPro=findViewById(R.id.tuan6detailTvStyleId);
        TextView tvPricePro=findViewById(R.id.tuan6detailTvPrice);
        TextView tvInfoPro= findViewById(R.id.tuan6detailTvAddInfo);
        TextView tvBrandPro= findViewById(R.id.tuan6detailTvBrand);
        if(product!=null)
        {
            Picasso.get().load(product.getSearchImage()).into(imgPro);
            tvPricePro.setText("Price: "+product.getPrice());
            tvInfoPro.setText("Info: " +product.getAdditionalInfo() );
            tvStyleIdPro.setText("StyleId: "+product.getStyledId());
            tvBrandPro.setText("Brand: "+product.getBrand());
        }
    }
}