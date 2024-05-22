package week8;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class Product implements Parcelable {
    private String styledId;
    private String brand;
    private String price;
    private String additionalInfo;
    private String searchImage;

    public Product() {
    }

    public Product(String styledId,String brand,String price,String additionalInfo,String searchImage) {
        this.styledId = styledId;
        this.brand = brand;
        this.price= price;
        this.additionalInfo = additionalInfo;
        this.searchImage=searchImage;
    }

    protected Product(Parcel in) {
        styledId = in.readString();
        brand = in.readString();
        price = in.readString();
        additionalInfo = in.readString();
        searchImage = in.readString();
    }

    public static final Creator<Product> CREATOR = new Creator<Product>() {
        @Override
        public Product createFromParcel(Parcel in) {
            return new Product(in);
        }

        @Override
        public Product[] newArray(int size) {
            return new Product[size];
        }
    };

    public String getStyledId() {
        return styledId;
    }

    public void setStyledId(String styledId) {
        this.styledId = styledId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public String getSearchImage() {
        return searchImage;
    }

    public void setSearchImage(String searchImage) {
        this.searchImage = searchImage;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeString(styledId);
        dest.writeString(brand);

        dest.writeString(price);
        dest.writeString(additionalInfo);
        dest.writeString(searchImage);
    }
}
