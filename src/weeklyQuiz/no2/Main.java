package weeklyQuiz.no2;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Stock stock = new Stock();

    stock.addClothing("T-Shirt", 20000, 100, "L");
    stock.addFood("Banana", 3000, 2000, "2024-06-24");
    stock.addElectronics("iphone56", 1000000, 5, "Apple");
    stock.addElectronics("galaxy", 1000000, 10, "Samsung");

    //메인 실행 반복문
    while (true) {
      System.out.println("사용자모드를 정수로 입력해주세요.");
      System.out.println("1. 구매자 ㅣ 2. 관리자 ㅣ 0. 종료");
      int select = sc.nextInt();

      if (select == 0) {
        System.out.println("쇼핑몰을 이용해주셔서 감사합니다.");
        break;
      }

      if (select == 1) {
        System.out.println("구매를 원하는 종류의 갯수를 0보다 큰 정수로 입력해주세요.");
        int size = sc.nextInt();

        if (size <= 0) {
          System.out.println("잘못 입력했습니다.");
          break;
        }

        ShoppingMall shoppingMall = new PremiumShoppingMall(size);

        System.out.println("구매 가능한 목록을 조회합니다.");
        stock.printProducts();


        while (true) {
          System.out.println("원하는 메뉴를 선택해주세요.");
          System.out.println("1. 상품 담기 ㅣ 2. 상품 삭제 ㅣ 3. 상품조회 ㅣ 4. 상품구매 가능여부 ㅣ 5. 장바구니 가격조회 ㅣ 0. 종료");
          select = sc.nextInt();

          if (select == 0) {
            System.out.println("구매자모드를 종료합니다.");
            break;
          }

          switch (select) {
            case 1:
              System.out.println("어떤 상품을 장바구니에 담겠습니까?");
              System.out.println("name, price, stock 를 순서대로 입력해주세요");
              String name = sc.next();
              int price = sc.nextInt();
              int thisStock = sc.nextInt();
              shoppingMall.addList(name, price, thisStock);
              break;
            case 2:
              System.out.println("어떤 상품을 장바구니에서 삭제하겠습니까?");
              String removeName = sc.next();
              shoppingMall.removeList(removeName);
              break;
            case 3:
              System.out.println("장바구니에 담긴 목록을 조회합니다.");
              shoppingMall.listPrint();
              break;
            case 4:
              if (shoppingMall.checkOrderAvailability()) {
                System.out.println("주문이 가능합니다.");
              } else {
                System.out.println("주문이 불가능합니다.");
              }
              break;
            case 5:
              System.out.println("가격을 조회합니다.");
              System.out.println(shoppingMall.sumPrice());
              break;
          }
        }
      } else {
        while (true) {
          System.out.println("어떤 상품을 등록할까요?");
          System.out.println("1. 옷 ㅣ 2. 음식 ㅣ 3. 전자기기 ㅣ 4. 목록조회 ㅣ 0. 종료");
          select = sc.nextInt();

          if (select == 0) {
            System.out.println("관리자모드를 종료합니다.");
            break;
          }

          switch (select) {
            case 1:
              System.out.println("name, price, stock, size 를 순서대로 입력해주세요");
              String name = sc.next();
              int price = sc.nextInt();
              int thisStock = sc.nextInt();
              String size = sc.next();
              stock.addClothing(name, price, thisStock, size);
              break;
            case 2:
              System.out.println("name, price, stock, expirationDate 를 순서대로 입력해주세요");
              String name2 = sc.next();
              int price2 = sc.nextInt();
              int thisStock2 = sc.nextInt();
              String expirationDate = sc.next();
              stock.addClothing(name2, price2, thisStock2, expirationDate);
              break;
            case 3:
              System.out.println("name, price, stock, brand 를 순서대로 입력해주세요");
              String name3 = sc.next();
              int price3 = sc.nextInt();
              int thisStock3 = sc.nextInt();
              String brand = sc.next();
              stock.addClothing(name3, price3, thisStock3, brand);
              break;
            case 4:
              System.out.println("상품 목록을 조회합니다.");
              stock.printProducts();
              break;
            default:
              System.out.println("잘못 입력했습니다.");
              break;
          }
        }
      }
    }
  }
}
