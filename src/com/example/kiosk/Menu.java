package com.example.kiosk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);

    List<MenuItem> burgerItems = new ArrayList<>();
    List<MenuItem> drinkItems = new ArrayList<>();
    List<MenuItem> dessertItems = new ArrayList<>();

    // 카테고리 선택 후 해당 메뉴 리스트 출력
    public void burgerMenu () {
        for (MenuItem item : burgerItems) {
            System.out.println(" | "+item.getMenuNum()+" . "+item.getName()+" | "+item.getPrice()+" | "+item.getDetail()+" | ");
        }
    }

    public void drinkMenu () {
        for (MenuItem item : drinkItems) {
            System.out.println(item.getName()+" | "+item.getPrice()+" | "+item.getDetail());
        }
    }

    public void dessertMenu () {
        for (MenuItem item : dessertItems) {
            System.out.println(item.getName()+" | "+item.getPrice()+" | "+item.getDetail());
        }
    }

    public void selectCategory () {
        System.out.println("---------------");
        System.out.println("| 1 . BURGERS |");
        System.out.println("| 2 . DRINKS  |");
        System.out.println("| 3 . DESSERT |");
        System.out.println("---------------");
        System.out.println("메뉴를 선택해 주세요");

    }

}
