package weeklyQuiz.no2;

public class PremiumShoppingMall extends AbstractShoppingMall {
    public PremiumShoppingMall(int size) {
        super(size);
    }

    @Override
    public boolean checkOrderAvailability() {
        for (int i = 0; i < arrayCount; i++) {
            if (products[i].getStock() < 10) {
                return false;
            }else if(products[i].getName().isEmpty()){
                return false;
            }
        }
        return true;
    }
}
