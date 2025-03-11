package com.example.kiosk;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Kiosk kiosk = new Kiosk();


        //1. 아무거나 누르고 키오스크 시작하기
        kiosk.InputStart();

        //2. 카테고리선택 -> 아이템 선택
        kiosk.select();








    }
}