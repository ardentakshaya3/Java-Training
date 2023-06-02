public class Product {
    Double price;

    public void setPrice(Double p) {
        this.price=p;
    }
    public Double getPrice(int quantity) {
        return (this.price*quantity);
    }
    public  Double getPrice(double quantity) {
        return (this.price*quantity);
    }
}
