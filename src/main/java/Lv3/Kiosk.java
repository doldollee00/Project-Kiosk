package Lv3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    //키오스크 프로그램의 메뉴를 관리하고 사용자 입력을 처리하는 클래스입니다.

    //MenuItem을 관리하는 리스트
    List<MenuItem> menuItems = new ArrayList<>();

    //생성자
    public Kiosk(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    //start()
    public void start() {
        // Scanner 선언
        Scanner sc = new Scanner(System.in);

        // 반복문을 활용해 List 안에 있는 MenuItem을 하나씩 출력
        for (int i = 0; i < menuItems.size(); i++) {
            Lv3.MenuItem menulist = menuItems.get(i);
            System.out.println((i + 1) + ".  " + menulist.name + "  |  " + menulist.price + "  |  " + menulist.info);
        }
        System.out.println("------------------------------------");
        while (true) {
            // 숫자를 입력 받기
            System.out.println("번호를 선택 하세요. (0은 종료) : ");
            int number = sc.nextInt();

            // 입력된 숫자에 따른 처리
            // 선택한 메뉴 : 이름, 가격, 설명
            switch (number) {
                case 1:
                    System.out.println("뉴욕버거\t|\t10000\t|\t비싸다");
                    break;
                case 2:
                    System.out.println("서울버거\t|\t8000\t|\t평균이다");
                    break;
                case 3:
                    System.out.println("부산버거\t|\t5000\t|\t저렴하다");
                    break;
                case 4:
                    System.out.println("울산버거\t|\t100000\t|\t강하다");
                    break;
            }
            // 프로그램을 종료
            if (number == 0) {
                System.out.println("종료");
                break;
            }
        }
    }
}
