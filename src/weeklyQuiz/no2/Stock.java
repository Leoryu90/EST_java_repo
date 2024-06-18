package weeklyQuiz.no2;

import java.util.ArrayList;
import java.util.List;

public class Stock {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void addClothing(String name, int price, int stock, String size) {
        Clothing clothes = new Clothing(name, price, stock, size);
        products.add(clothes);
    }

    public void addFood(String name, int price, int stock, String expirationDate) {
        Food food = new Food(name, price, stock, expirationDate);
        products.add(food);
    }

    public void addElectronics(String name, int price, int stock, String brand) {
        Electronics electronics = new Electronics(name, price, stock, brand);
        products.add(electronics);
    }

    public List<Product> getProducts() {
        return products;
    }

    public void printProducts() {
        System.out.println("전체 상품 목록");
        for (Product product : products) {
            System.out.println(product);
        }
    }
}

