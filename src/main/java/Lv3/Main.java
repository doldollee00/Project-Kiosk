package Lv3;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        //객체 생성
        MenuItem menuItem1 = new MenuItem("뉴욕버거", 10000, "비싸다");
        MenuItem menuItem2 = new MenuItem("서울버거", 8000, "평균이다");
        MenuItem menuItem3 = new MenuItem("부산버거", 5000, "저렴하다");
        MenuItem menuItem4 = new MenuItem("울산버거", 1000000, "강하다");

        // List 선언 및 초기화
        List<MenuItem> menuItems = new ArrayList<>();

        // add 함수를 통해 new MenuItem(이름, 가격, 설명) List에 삽입
        menuItems.add(menuItem1);
        menuItems.add(menuItem2);
        menuItems.add(menuItem3);
        menuItems.add(menuItem4);

        //start()
        Kiosk kiosk = new Kiosk(menuItems);
        kiosk.start();

    }
}
