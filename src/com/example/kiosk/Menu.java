package com.example.kiosk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);

    List<MenuItem> burgerItems = new ArrayList<>();
    List<MenuItem> drinkItems = new ArrayList<>();
    List<MenuItem> dessertItems = new ArrayList<>();

    // 카테고리 출력
    public void printCategory () {
        System.out.println("[  MAIN MENU  ]");
        System.out.println("| 1 . BURGERS |");
        System.out.println("| 2 . DRINKS  |");
        System.out.println("| 3 . DESSERT |");
        System.out.println("| 0 . 종료     |");
        System.out.println("메뉴를 선택해 주세요");

    }

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

    // kiosk에서 리스트에 접근할 수 있도록 getter 메서드 구현
    public List<MenuItem> getBurgerItems() {
        return burgerItems;
    }

    public List<MenuItem> getDrinkItems() {
        return drinkItems;
    }

    public List<MenuItem> getDessertItems () {
        return dessertItems;
    }


}
