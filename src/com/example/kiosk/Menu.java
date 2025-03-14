package com.example.kiosk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);

    // 속성
    String categoryName;
    List<MenuItem> menuItems = new ArrayList<>();

    // 생성자
    Menu () {} // 메서드 사용을 위한 기본 생성자
    Menu (String categoryName) { // 카테고리 객체 생성을 위한 생성자
        this.categoryName = categoryName;
        this.menuItems = new ArrayList<>();
    }

    public void addItem(MenuItem item){
        menuItems.add(item);
    }

//  카테고리 별 메뉴 리스트 출력
    public void printItems() {
        System.out.println("    ");
        System.out.println(categoryName +" Menu ᯓ⋆.˚");
        System.out.println("───────── ౨ৎ ────────────────── ౨ৎ ────────────────── ౨ৎ ─────────");
        for (MenuItem item : menuItems) {
            System.out.printf("%-3d %-18s %.1f    %-29s\n",
                    item.getMenuNum(), item.getName(), item.getPrice(), item.getDetail());
        }

        System.out.println("───────── ౨ৎ ────────────────── ౨ৎ ────────────────── ౨ৎ ─────────");
        System.out.println("                                      Return to main menu ━━━☞ 0");
          System.out.print("                                      ⊹⁺ Select your menu ━━━☞ ");
    }

//  getter
    // kiosk 에서 리스트에 접근할 수 있도록 getter 메서드 구현
    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    // 카테고리 getter
    public String getCategoryName () {
        return categoryName;
    }
}
