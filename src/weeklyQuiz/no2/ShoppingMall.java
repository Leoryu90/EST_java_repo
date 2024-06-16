package weeklyQuiz.no2;

public class ShoppingMall {
    Electronics iphone501 = new Electronics("iphone501", 50000, 50, "Apple");
    Clothing boxT = new Clothing("muziT", 25000, 50, "L");
    Food milk = new Food("milk", 2000, 50, "2024-06-20");

    Product[] products;
    int arrayCount = 0;

    public ShoppingMall(int size) {
      products = new Product[size];
    }

    public void addProduct(String name, int price, int stock){
      Product s = new Product(name, price, stock);
      products[arrayCount] = s;
      arrayCount++;
    }
}
