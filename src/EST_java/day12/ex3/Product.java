package EST_java.day12.ex3;

public class Product <Y,M>{
    private Y name;
    private M price;

    public Y getName() {
        return name;
    }

    public void setName(Y name) {
        this.name = name;
    }

    public M getPrice() {
        return price;
    }

    public void setPrice(M price) {
        this.price = price;
    }
}
