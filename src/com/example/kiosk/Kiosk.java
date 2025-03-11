package com.example.kiosk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    Scanner scanner = new Scanner(System.in);
    Menu menu = new Menu();
    List<String> cart = new ArrayList<>();
    int totalPrice = 0;


// **키오스크 시작하기**
   void start (){
       System.out.println("키오스크를 시작하려면 아무거나 입력하세요");
       scanner.nextLine();
       System.out.println("키오스크를 시작합니다");
       menu.wholeMenu(); //<-- 전체아이템 넣어주기
    }

// **카테고리 선택- > 메뉴출력**
    void selectOrderItem () {
        menu.printCategory();

        int categoryNum = scanner.nextInt();
        scanner.nextLine();

        if (categoryNum==0) { // 종료
            System.out.println("주문을 종료합니다");
            System.exit(0);
        }

        switch (categoryNum) {
            case 1 :
                menu.burgerMenu();
                addMenu(menu.getBurgerItems());
                break;
            case 2 :
                menu.drinkMenu();
                addMenu(menu.getDrinkItems());
                break;
            case 3 :
                menu.dessertMenu();
                addMenu(menu.getDessertItems());
                break;
            default:
                System.out.println("잘못된 숫자입니다");
        }
    }

    // 메뉴 추가 메서드
    void addMenu (List<MenuItem> itemList) {
       while(true) {
           int menuNum = scanner.nextInt();
           scanner.nextLine();

           if (menuNum == 0) { // 뒤로가기
               return;
           }

           for (MenuItem item : itemList) {
               if (item.getMenuNum() == menuNum) {
                   cart.add(item.getName());
                   totalPrice += item.getPrice();
                   System.out.println("장바구니 : " + cart + " | 현재 금액 : " + totalPrice);
                   break;
               }
           }
       }
    }

////     장바구니 결제 메서드
//    void order (List<String> cart){
//       if(cart.isEmpty()) {
//           return;
//       } System.out.println("9번을 누르면 주문하기");
//           int orderNum = scanner.nextInt();
//
//           (orderNum ==9)
//       }
//
//    }


}
