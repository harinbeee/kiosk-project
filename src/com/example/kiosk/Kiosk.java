package com.example.kiosk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    Scanner scanner = new Scanner(System.in);
    Menu menu = new Menu();

    // 전체 메뉴들
    List<Menu> menus = new ArrayList<>();
    // 장바구니
    List<String> cart = new ArrayList<>();
    int totalPrice = 0;

// **키오스크 시작하기**
   public void start (){
       System.out.println("\n     ˚✧₊⁎  welcome  ⁎⁺˳✧˚   ");
       System.out.println("─────────── ⋆⋅☆⋅⋆ ───────────");
       System.out.println("    Press any key to begin   ");
       scanner.nextLine();

       initItem();//<-- 전체아이템 넣어주기
    }

// **카테고리 선택- > 메뉴출력**
   public void selectOrderItem () {

        printCategory();

        int selectCategoryNum = scanner.nextInt();
        scanner.nextLine();

        if (selectCategoryNum==0) { // 종료
            System.out.println("주문을 종료합니다");
            System.exit(0);
        }

        if (selectCategoryNum > menus.size()) { // 예외처리
            System.out.println("해당 카테고리는 존재하지 않습니다.");
            return;
        }

        Menu selectMenu = menus.get(selectCategoryNum-1);
        selectMenu.printItems();

        addMenu(selectMenu.getMenuItems());
    }

// ** 장바구니 담기, 주문하기 **
   private void addMenu (List<MenuItem> itemList) {
       while(true) {
           int selectMenuNum = scanner.nextInt();
           scanner.nextLine();

           if (selectMenuNum == 0) { // 뒤로가기
               return;
           }

           if (selectMenuNum > itemList.size()) { // 예외처리
               System.out.println("해당 상품번호는 존재하지 않습니다.");
               return;
           }

           for (MenuItem item : itemList) {
               if (item.getMenuNum() ==selectMenuNum) {
                   cart.add(item.getName());
                   totalPrice += (int)((item.getPrice())*1000);
                   System.out.println("\n   ");
                   System.out.println(" 🛒 Your Cart : " + cart );
                   System.out.println(" 🛒 Total Price : " + totalPrice +"원");
                   System.out.println("───────── ౨ৎ ────────────────── ౨ৎ ────────────────── ౨ৎ ─────────");
                   break;
               }
           }
           if(!cart.isEmpty() && selectMenuNum != 9) {
                     System.out.print("                            Press 9 to complete your order ━━━☞ ");
           }

           if (selectMenuNum==9) {
               System.out.println("\n   ");
               System.out.println(" 🌿 Paid : " + totalPrice +"  원");
               System.out.println(" 🌿 Order Details : " + cart);
               System.out.println("───────── ౨ৎ ────────────────── ౨ৎ ────────────────── ౨ৎ ─────────");
               System.out.println("                    ⋆⁺₊⋆ ☾ ⋆⁺₊⋆ ☁\uFE0E  Thank you for your order!");
               cart.clear();
           }
       }
    }

// **카테고리**
    //카테고리 출력 메서드
    public void printCategory () {
        System.out.println("\n╭────── · · ୨୧ · · ──────╮");
        System.out.println("        Main Menu        ");
        System.out.println(" ⠂⠄⠄⠂⠁⠁⠂⠄⠄⠂⠁⠁⠂⠄⠄⠂ ⠂⠄⠄⠂☆");
        for (int i = 0; i < menus.size(); i++) {
            System.out.printf("    %-10s    %-2d  \n",  menus.get(i).getCategoryName(),(i+1));
        }
        System.out.println("    🔚 Exit       0        ");
        System.out.println(" ⠂⠄⠄⠂⠁⠁⠂⠄⠄⠂⠁⠁⠂⠄⠄⠂ ⠂⠄⠄⠂☆");
        System.out.println("╰────── · · ୨୧ · · ──────╯");
        System.out.println("Thank you for visiting...");
        System.out.print("      ⊹⁺⸜ Select your menu    ━━━☞  ");
    }

// **menuitem 객체**
    public void initItem() {
        Menu coffeeMenu = new Menu ("☕️ Coffee");
        coffeeMenu.addItem(new MenuItem(1,"Caffe Americano", 4.7, "에스프레소를 가장 부드럽게 느낄 수 있는 커피"));
        coffeeMenu.addItem(new MenuItem(2,"Flat White", 5.8, "리스트레토 샷과 완벽한 스팀밀크 조화의 커피"));
        coffeeMenu.addItem(new MenuItem(3,"Caffe latte", 5.2, "풍부한 에스크레소와 스팀밀크의 대표적인 커피"));
        coffeeMenu.addItem(new MenuItem(4,"Caffe Mocha", 5.6, "진한 초콜릿 모카시럽과 크림으로 마무리한 커피"));
        coffeeMenu.addItem(new MenuItem(5,"Cream Latte", 6.5, "달콤한 슈크림과 진한 에스프레소가 조화된 커피"));


        Menu teaMenu = new Menu ("🫖 Tea");
        teaMenu.addItem(new MenuItem(1,"Peach Black Tea", 4.0, "복숭아의 진한 맛과 홍차의 청량한 아이스 음료"));
        teaMenu.addItem(new MenuItem(2,"Classic Milk Tea", 5.0, "진하게 우려낸 블랙티의 깊은 풍미와 우유의 조화"));
        teaMenu.addItem(new MenuItem(3,"Earl Grey Tea", 4.5, "꽃향 가득한 라벤더와 베르가못 향이 진한 홍차"));
        teaMenu.addItem(new MenuItem(4,"Chamomile Tea", 4.5, "캐모마일의 차분한 향으로 기분이 좋아지는 허브티"));

        Menu dessertMenu = new Menu ("🍰 Dessert");
        dessertMenu.addItem(new MenuItem(1,"Strawberry Cake", 7.3, "달콤한 초코시트와 딸기가 샌드된 클래식한 케이크"));
        dessertMenu.addItem(new MenuItem(2,"Basque Cake", 7.0, "겉은 스모키하고 속은 크리미한 치즈 케이크"));
        dessertMenu.addItem(new MenuItem(3,"Tiramisu Cake", 6.5, "마스카포네 치즈 크림과 커피시럽의 케이크"));

        //카테고리별 리스트에 넣기
        menus.add(coffeeMenu);
        menus.add(teaMenu);
        menus.add(dessertMenu);

    }
}



