# **🌿 KIOSK 키오스크**
**Java 콘솔 기반의 키오스크 프로그램**

<br>

**▪️프로젝트 기간**
- 2025-03-06 ~ 2025-03-14

**▪️개발 환경**  
- Java: 17  
- JDK: 17.0.1  
- IDE: IntelliJ  

<br>

## **주요 기능** 
- 메뉴 카테고리 선택
- 메뉴 리스트 출력 (감성카페st 디자인 적용)
- 장바구니 기능 (카테고리를 이동하며 아이템 추가 가능)
- 주문하기 (주문완료시 주문내역, 결제금액 출력 / 0을 입력하면 재실행 )


<br>

## **파일 구조**
```

📂 com.example.kiosk  
 ┣ 📜 Main.java        ← 프로그램 실행
 ┣ 📜 Kiosk.java       ← 키오스크 전체 기능
 ┣ 📜 Menu.java        ← 카테고리별 메뉴 관리, 메뉴 출력
 ┗ 📜 MenuItem.java    ← 개별 메뉴 아이템 관리 (이름, 가격, 설명)

```



## **실행예시 - 카페**
```

     ˚✧₊⁎  welcome  ⁎⁺˳✧˚   
─────────── ⋆⋅☆⋅⋆ ───────────
    Press any key to begin   


╭────── · · ୨୧ · · ──────╮
        Main Menu        
 ⠂⠄⠄⠂⠁⠁⠂⠄⠄⠂⠁⠁⠂⠄⠄⠂ ⠂⠄⠄⠂☆
    ☕️ Coffee     1   
    🫖 Tea        2   
    🍰 Dessert    3   
    🔚 Exit       0        
 ⠂⠄⠄⠂⠁⠁⠂⠄⠄⠂⠁⠁⠂⠄⠄⠂ ⠂⠄⠄⠂☆
╰────── · · ୨୧ · · ──────╯
Thank you for visiting...
      ⊹⁺⸜ Select your menu    ━━━☞  1
    
☕️ Coffee Menu ᯓ⋆.˚
───────── ౨ৎ ────────────────── ౨ৎ ────────────────── ౨ৎ ─────────
1   Caffe Americano    4.7    에스프레소를 가장 부드럽게 느낄 수 있는 커피    
2   Flat White         5.8    리스트레토 샷과 완벽한 스팀밀크 조화의 커피     
3   Caffe latte        5.2    풍부한 에스크레소와 스팀밀크의 대표적인 커피     
4   Caffe Mocha        5.6    진한 초콜릿 모카시럽과 크림으로 마무리한 커피    
5   Cream Latte        6.5    달콤한 슈크림과 진한 에스프레소가 조화된 커피    
───────── ౨ৎ ────────────────── ౨ৎ ────────────────── ౨ৎ ─────────
                                      Return to main menu ━━━☞ 0
                                      ⊹⁺ Select your menu ━━━☞ 2


 🛒 Your Cart : [Flat White]
 🛒 Total Price : 5800원
───────── ౨ৎ ────────────────── ౨ৎ ────────────────── ౨ৎ ─────────
                            Press 9 to complete your order ━━━☞ 9


 🌿 Paid : 5800  원
 🌿 Order Details : [Flat White]
───────── ౨ৎ ────────────────── ౨ৎ ────────────────── ౨ৎ ─────────
                    ⋆⁺₊⋆ ☾ ⋆⁺₊⋆ ☁︎  Thank you for your order!


```

 

