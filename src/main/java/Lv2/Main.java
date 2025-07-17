package Lv2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        MenuItem menuItem1 = new MenuItem("뉴욕버거", 10000, "비싸다");
        MenuItem menuItem2 = new MenuItem("서울버거", 8000, "평균이다");
        MenuItem menuItem3 = new MenuItem("부산버거", 5000, "저렴하다");
        MenuItem menuItem4 = new MenuItem("울산버거", 1000000, "강력이다");

        // List 선언 및 초기화
        List<MenuItem> menuItems = new ArrayList<>();

        // add 함수를 통해 new MenuItem(이름, 가격, 설명) List에 삽입
        menuItems.add(menuItem1);
        menuItems.add(menuItem2);
        menuItems.add(menuItem3);
        menuItems.add(menuItem4);

        // Scanner 선언
        Scanner sc = new Scanner(System.in);

        // 반복문을 활용해 List 안에 있는 MenuItem을 하나씩 출력

        for (int i = 0; i < menuItems.size(); i++) {
            MenuItem menulist = menuItems.get(i);
            System.out.println((i+1) + ".  " + menulist.name + "  |  " + menulist.price + "  |  " + menulist.info);
        }
        System.out.println("------------------------------------");
        while(true) {
            // 숫자를 입력 받기
            System.out.println("번호를 선택 (0은 종료) : ");
            int number = sc.nextInt();

            // 입력된 숫자에 따른 처리
            // 선택한 메뉴 : 이름, 가격, 설명
            switch(number) {
                case 1:
                    System.out.println(menuItems.get(0));
                    break;
                case 2:
                    System.out.println(menuItems.get(0));
                    break;
                case 3:
                    System.out.println(menuItems.get(1));
                    break;
                case 4:
                    System.out.println(menuItems.get(2));
                    break;
            }
            // 프로그램을 종료
            if(number == 0){
                System.out.println("종료");
                break;
            }
        }
    }
}

