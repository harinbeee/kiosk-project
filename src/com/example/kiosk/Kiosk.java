package com.example.kiosk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    Scanner scanner = new Scanner(System.in);
    Menu menu = new Menu();
    List<String> cart = new ArrayList<>(); // 장바구니

// **키오스크 시작하기**
   void start (){
       System.out.println("키오스크를 시작하려면 아무거나 입력하세요");
       scanner.nextLine();
       System.out.println("키오스크를 시작합니다");
       wholeMenu(); //<-- 전체아이템 넣어주기
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
                   System.out.println("장바구니 : " + cart);
                   break;
               }
           }
       }
    }



    public void wholeMenu () {
        MenuItem shackBurger = new MenuItem(1,"ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        MenuItem smokeBurger = new MenuItem(2,"SmokeBurger", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        MenuItem cheeseBurger = new MenuItem(3,"CheeseBurger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        MenuItem hamBurger = new MenuItem(4,"HamBurger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거");

        MenuItem coke =new MenuItem(1,"콜라", 1.0, "콜라입니다");
        MenuItem cider =new MenuItem(2,"사이다", 1.0, "사이다입니다");
        MenuItem coffee =new MenuItem(3,"아메리카노", 1.5, "커피입니다");

        MenuItem potato =new MenuItem(1,"감튀", 3.0, "감튀입니다");
        MenuItem stick = new MenuItem(2,"치즈스틱", 3.0, "치즈스틱입니다");
        MenuItem iceCream =new MenuItem(3,"아이스크림", 3.0, "아이스크림입니다");

        menu.burgerItems.add(shackBurger);
        menu.burgerItems.add(smokeBurger);
        menu.burgerItems.add(cheeseBurger);
        menu.burgerItems.add(hamBurger);

        menu.drinkItems.add(coke);
        menu.drinkItems.add(cider);
        menu.drinkItems.add(coffee);

        menu.dessertItems.add(potato);
        menu.dessertItems.add(stick);
        menu.dessertItems.add(iceCream);
    }


}
