package weeklyQuiz.no2;

public abstract class ConcreteShoppingMall extends ShoppingMall{

    public ConcreteShoppingMall(int size) {
        super(size);
    }

    public abstract boolean checkOrderAvailability(int s);
}
