package week8;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class ProductAdapter extends BaseAdapter {
    private Context mContext;
    private List<Product> mProductList;

    public ProductAdapter(Context context, List<Product> productList) {
        this.mContext = context;
        this.mProductList = productList;
    }

    @Override
    public int getCount() {
        return mProductList.size();
    }

    @Override
    public Object getItem(int position) {
        return mProductList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolderT61 holder;
        if (convertView==null)
        {
            convertView= LayoutInflater.from(mContext).inflate(R.layout.item_view_t61,parent,false);
            holder=new ViewHolderT61();
            holder.imageView=convertView.findViewById(R.id.item_product_imageView);
            holder.styleidTv=convertView.findViewById(R.id.item_styleid_textview);
            holder.brandTv=convertView.findViewById(R.id.item_brand_textview);
            holder.priceTv=convertView.findViewById(R.id.item_price_textview);
            holder.additionalInfoTv=convertView.findViewById(R.id.item_additionalInfo_textview);
            convertView.setTag(holder);
        }
        else {
            holder=(ViewHolderT61) convertView.getTag();
        }
        Product product=mProductList.get(position);
        if (product!=null)
        {
            Picasso.get().load(product.getSearchImage()).into(holder.imageView);
            holder.additionalInfoTv.setText(product.getAdditionalInfo());
            holder.brandTv.setText(product.getBrand());
            holder.priceTv.setText(product.getPrice());
            holder.styleidTv.setText(product.getStyledId());
        }
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Product product=mProductList.get(position);
                Intent intent=new Intent(mContext,Tuan6DetailActivity.class);
                intent.putExtra("PRODUCT",product);
                mContext.startActivity(intent);
            }
        });
        return convertView;
    }
    static class ViewHolderT61{
        ImageView imageView;
        TextView styleidTv,brandTv,priceTv,additionalInfoTv;
    }
}
