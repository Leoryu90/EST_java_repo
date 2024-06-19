package weeklyQuiz.no2;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Food extends Product{
    private String expirationDate;
    LocalDate nowData = LocalDate.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Food(String name, int price, int stock, String expiration) {
        super(name, price, stock);
        this.expirationDate = expiration;
        LocalDate date = LocalDate.parse(expirationDate, formatter);
    }

    @Override
    public int calculatePrice() {
        double shortExpiration;
        LocalDate expirationToLocalData = LocalDate.parse(expirationDate, formatter);
        if (expirationToLocalData.compareTo(nowData) <= 7) {
            shortExpiration = super.getPrice() * 0.8;
            return (int) shortExpiration;
        }else if (expirationToLocalData.compareTo(nowData) > 7) {
            return super.getPrice();
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Food [" + super.toString() + ", " + "expirationDate= " + expirationDate + "]";
    }
}

