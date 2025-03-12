package com.example.kiosk;


public class MenuItem  {
//    속성
    private int menuNum;
    private String name;
    private double price;
    private  String detail;

//    생성자
    public MenuItem(int menuNum, String name, double price, String detail) {
        this.menuNum = menuNum;
        this.name = name;
        this.price = price;
        this.detail = detail;
    }


//
    public int getMenuNum() {
        return menuNum;
    }
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
