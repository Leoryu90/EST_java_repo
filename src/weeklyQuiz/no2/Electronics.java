package weeklyQuiz.no2;

public class Electronics extends Product{
    private String brand;

    public Electronics(String name, int price, int stock, String brand) {
        super(name, price, stock);
        this.brand = brand;
    }

    public int calculatePrice() {
        double premiumPrice = 0;
        if (brand.equals("Apple")){
            premiumPrice = super.getPrice() * 1.2;
        }
        return (int) premiumPrice;
    }
}
