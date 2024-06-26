package weeklyQuiz.no2;

public class Clothing extends Product{
    private String size;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Clothing(String name, int price, int stock, String size) {
        super(name, price, stock);
        this.size = size;
    }

    @Override
    public int calculatePrice() {
        double bigSizePrice = super.getPrice();
        if (size.equals("L") || size.equals("XL") || size.equals("XXL")){
            bigSizePrice = super.getPrice() * 1.1;
        }
        return (int) bigSizePrice;
    }

    @Override
    public String toString() {
        return "Clothing [" + super.toString() + ", " + "size= " + size + "]";
    }
}
