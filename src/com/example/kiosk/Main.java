package com.example.kiosk;

public class Main {
    public static void main(String[] args) {
        Kiosk kiosk = new Kiosk();

        //1. 아무거나 누르고 키오스크 시작하기
        kiosk.start();
        //2. 장바구니 채우기
        while(true) {
            kiosk.selectOrderItem();

        }

    }
}