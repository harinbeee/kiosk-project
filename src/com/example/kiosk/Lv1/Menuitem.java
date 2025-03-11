package com.example.kiosk.Lv1;

public class Menuitem {

    //    속성
    String name;
    double price;
    String detail;

    //    생성자
    public Menuitem(String name, double price, String detail) {
        this.name = name;
        this.price = price;
        this.detail = detail;
    }

    // 기능

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public String getDetail() {
        return detail;
    }


}
