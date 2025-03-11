package com.example.kiosk.Lv1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    Scanner scanner = new Scanner(System.in);
    List<Menuitem> menuitem = new ArrayList<>();

    void wholeMenu () {
        menuitem.add(new Menuitem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuitem.add(new Menuitem("SmokeBurger", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuitem.add(new Menuitem("CheeseBurger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuitem.add(new Menuitem("HamBurger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));
    }

    void start () {
        System.out.println("키오스크를 시작하려면 아무거나 입력하세요");
        scanner.nextLine();
        System.out.println("키오스크를 시작합니다");
        wholeMenu();

        for (Menuitem item : menuitem) {
            System.out.println(item.getName() + " | " + item.getPrice() + " | " + item.getDetail());
        }
        System.out.print("종료는 0 | ");
        System.out.print("메뉴를 선택하세요 : ");
        int num = scanner.nextInt();

        switch (num) {
            case 1:
                System.out.println("선택한 버거 : ShackBurger");
                break;
            case 2:
                System.out.println("선택한 버거 : SmokeBurger");
                break;
            case 3:
                System.out.println("선택한 버거 : CheeseBurger");
                break;
            case 4:
                System.out.println("선택한 버거 : HamBurger");
                break;
            case 0:
                System.out.println("키오스크를 종료합니다.");
                System.exit(0);
            default:
                System.out.println("잘못된 값을 입력했습니다.");
        }
    }
}
