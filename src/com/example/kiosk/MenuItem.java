package com.example.kiosk;

import java.util.ArrayList;
import java.util.List;

public class MenuItem  {
//    속성
    int menuNum;
    String name;
    double price;
    String detail;

//    생성자
    public MenuItem(int menuNum, String name, double price, String detail) {
        this.menuNum = menuNum;
        this.name = name;
        this.price = price;
        this.detail = detail;
    }
    public int getMenuNum() {
        return menuNum;
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return (int)price*1000;
    }
    public String getDetail() {
        return detail;
    }

}
