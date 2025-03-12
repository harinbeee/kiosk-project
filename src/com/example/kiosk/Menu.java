package com.example.kiosk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);

    // 속성
    String categoryName;

    // 생성자
    Menu () {} // 메서드 사용을 위한 기본 생성자
    Menu (String categoryName) { // 카테고리 객체 생성을 위한 생성자
        this.categoryName = categoryName;
    }

    // Menuitem 클래스 List로 관리
    List<MenuItem> burgerItems = new ArrayList<>();
    List<MenuItem> drinkItems = new ArrayList<>();
    List<MenuItem> dessertItems = new ArrayList<>();


    // 카테고리 별 메뉴 리스트 출력
    public void burgerMenu () {
        System.out.println(" [ BURGER MENU ]");
        for (MenuItem item : burgerItems) {
            System.out.println(item.getMenuNum()+" . "+item.getName()+" | "+item.getPrice()+" | "+item.getDetail());
        }System.out.println("0 . 뒤로가기");
    }

    public void drinkMenu () {
        System.out.println(" [ DRINK MENU ]");
        for (MenuItem item : drinkItems) {
            System.out.println(item.getMenuNum() + " . " + item.getName() + " | " + item.getPrice() + " | " + item.getDetail());
        }System.out.println("0 . 뒤로가기");
    }

    public void dessertMenu () {
        System.out.println(" [ DESSERT MENU ]");
        for (MenuItem item : dessertItems) {
            System.out.println(item.getMenuNum() + " . " + item.getName() + " | " + item.getPrice() + " | " + item.getDetail());
        }System.out.println("0 . 뒤로가기");
    }

//  getter
    // kiosk 에서 리스트에 접근할 수 있도록 getter 메서드 구현
    public List<MenuItem> getBurgerItems() {
        return burgerItems;
    }

    public List<MenuItem> getDrinkItems() {
        return drinkItems;
    }

    public List<MenuItem> getDessertItems () {
        return dessertItems;
    }

    // 카테고리 getter
    public String getCategoryName () {
        return categoryName;
    }


    // 전체 메뉴아이템 객체
    public void wholeItem () {
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

        //카테고리별 리스트에 넣기
        burgerItems.add(shackBurger);
        burgerItems.add(smokeBurger);
        burgerItems.add(cheeseBurger);
        burgerItems.add(hamBurger);

        drinkItems.add(coke);
        drinkItems.add(cider);
        drinkItems.add(coffee);

        dessertItems.add(potato);
        dessertItems.add(stick);
        dessertItems.add(iceCream);

    }
}
