package com.example.kiosk;


public class MenuItem  {
//    속성
    private String category;
    private int menuNum;
    private String name;
    private double price;
    private  String detail;

//    생성자
    public MenuItem(String category, int menuNum, String name, double price, String detail) {
        this.category = category;
        this.menuNum = menuNum;
        this.name = name;
        this.price = price;
        this.detail = detail;
    }


//
    public String getCategory() {
        return category;
    }
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
