package week8;

public class Product {
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
}
