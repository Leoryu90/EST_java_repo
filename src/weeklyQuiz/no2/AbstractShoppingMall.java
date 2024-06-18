package weeklyQuiz.no2;

public abstract class AbstractShoppingMall extends ShoppingMall{

    public AbstractShoppingMall(int size) {
        super(size);
    }

    public abstract boolean checkOrderAvailability();
}
