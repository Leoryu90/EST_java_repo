package weeklyQuiz.no2;

public class Electronics extends Product{
    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Electronics(String name, int price, int stock, String brand) {
        super(name, price, stock);
        this.brand = brand;
    }

    @Override
    public int calculatePrice() {
        double premiumPrice = super.getPrice();
        if (brand.equals("Apple")){
            premiumPrice = super.getPrice() * 1.2;
        }
        return (int) premiumPrice;
    }

    @Override
    public String toString() {
        return "Electronics [" + super.toString() + ", " + "brand= " + brand + "]";
    }
}
