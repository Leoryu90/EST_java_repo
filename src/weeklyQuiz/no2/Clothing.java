package weeklyQuiz.no2;

public class Clothing extends Product{
    private String size;

    public Clothing(String name, int price, int stock, String size) {
        super(name, price, stock);
        this.size = size;
    }

    public int calculatePrice() {
        double bigSizePrice = 0;
        if (size.equals("L") || size.equals("XL") || size.equals("XXL")){
            bigSizePrice = super.getPrice() * 1.1;
        }
        return (int) bigSizePrice;
    }
}
