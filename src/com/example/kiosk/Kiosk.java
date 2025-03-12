package com.example.kiosk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    Scanner scanner = new Scanner(System.in);
    Menu menu = new Menu();
//    **리스트**
    // 전체 카테고리 --> 인덱스로 출력 완료 / 이걸로 메뉴리스트까지 출력하기
    List<Menu> allCategory = new ArrayList<>();

    // 장바구니
    List<String> cart = new ArrayList<>();
    int totalPrice = 0;


// **키오스크 시작하기**
   void start (){
       System.out.println("키오스크를 시작하려면 아무거나 입력하세요");
       scanner.nextLine();
       System.out.println("키오스크를 시작합니다");
       menu.wholeItem();//<-- 전체아이템 넣어주기
    }

// **카테고리 선택- > 메뉴출력**
    void selectOrderItem () {
        System.out.println("-----------------");
        printCategory();

        int selectCategoryNum = scanner.nextInt();
        scanner.nextLine();

        if (selectCategoryNum==0) { // 종료
            System.out.println("주문을 종료합니다");
            System.exit(0);
        }

        switch (selectCategoryNum) {
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

//    **카테고리**
    //카테고리 출력 메서드
    public void printCategory () {
        makeCategory();
        System.out.println("[  MAIN MENU  ]");
        for (Menu value : allCategory) {
            System.out.println(" | 1 . " + value.getCategoryName() + " | ");
        }
        System.out.println("메뉴를 선택해 주세요");
    }
    //카테고리 리스트에 추가
    public void makeCategory () {
        Menu burgermenu = new Menu("BURGER");
        Menu drinksmenu = new Menu("DRINKS");
        Menu dessertmenu = new Menu("DESSERT");

        if(allCategory.isEmpty()) {
            allCategory.add(burgermenu);
            allCategory.add(drinksmenu);
            allCategory.add(dessertmenu);
        }
    }

//    ** 장바구니, 결제 **
    void addMenu (List<MenuItem> itemList) {
       while(true) {
           int selectMenuNum = scanner.nextInt();
           scanner.nextLine();

           if (selectMenuNum == 0) { // 뒤로가기
               return;
           }

           for (MenuItem item : itemList) {
               if (item.getMenuNum() == selectMenuNum) {
                   cart.add(item.getName());
                   totalPrice += item.getPrice();
                   System.out.println("장바구니 : " + cart + " | 현재 금액 : " + totalPrice);
                   break;
               }
           }
       }
    }
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
