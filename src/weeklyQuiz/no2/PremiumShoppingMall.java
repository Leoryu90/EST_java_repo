package weeklyQuiz.no2;

public class PremiumShoppingMall extends ConcreteShoppingMall {
    public PremiumShoppingMall(int size) {
        super(size);
    }

    @Override
    public boolean checkOrderAvailability(int s) {
        for (int i = 0; i < arrayCount; i++) {
            if (products[i].getStock() < s) {
                return false;
            }
        }
        return true;
    }
}
