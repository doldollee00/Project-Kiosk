package Lv4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Menu 객체 생성을 통해 이름 설정
        Menu burgers = new Menu("Burgers");
        Menu drinks = new Menu("Drinks");
        Menu desserts = new Menu("Desserts");

        List<Menu> menu = new ArrayList<>();
        menu.add(burgers);
        menu.add(drinks);
        menu.add(desserts);

        // Menu 클래스 내 있는 List<MenuItem> 에 MenuItem 객체 생성하면서 삽입
        burgers.burgeris(new MenuItem("뉴욕버거", 10000, "비싸다"));
        burgers.burgeris(new MenuItem("서울버거", 8000, "평균이다"));
        burgers.burgeris(new MenuItem("부산버거", 5000, "저렴하다"));
        burgers.burgeris(new MenuItem("울산버거", 1000000, "강하다"));

        // Kiosk 객체 생성
        Kiosk kiosk = new Kiosk(menu);
        // Kiosk 내 시작하는 함수 호출
        kiosk.start();
    }
}
