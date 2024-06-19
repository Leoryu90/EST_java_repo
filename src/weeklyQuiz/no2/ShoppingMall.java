package weeklyQuiz.no2;

public class ShoppingMall {
    Product[] products;
    int arrayCount = 0;

    public Product[] getProducts() {
        return products;
    }

    public int getArrayCount() {
        return arrayCount;
    }

    public ShoppingMall(int size) {
      products = new Product[size];
    }

    public void addList(String name, int price, int stock){
      if (arrayCount == products.length){
          Product[] newProducts = new Product[products.length * 2];
          System.arraycopy(products, 0, newProducts, 0, products.length);
          products = newProducts;
      }
        products[arrayCount] = new Product(name, price, stock);
        arrayCount++;
    }

    public void removeList(String name) {
        int index = -1;
        for (int i = 0; i < arrayCount; i++) {
            if (products[i].getName().equals(name)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("해당 상품이 없습니다.");
            return;
        }

        for (int i = index; i < arrayCount - 1; i++) {
            products[i] = products[i + 1];
        }

        arrayCount--;
    }

    public void listPrint(){
        for (int i = 0; i < arrayCount; i++) {
            System.out.println(products[i]);
        }
    }

    public int sumPrice(){
        int sum = 0;
        for (int i = 0; i < arrayCount; i++) {
            sum += products[i].calculatePrice();
        }
        return sum;
    }

}
