package Lv4;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    List<MenuItem> menuItems = new ArrayList<>();

    String burgerName;

    public Menu(String burgerName) {
        this.burgerName = burgerName;
        //this.menuItems = new ArrayList<>();
    }

    public void burgeris(MenuItem menuI){
        menuItems.add(menuI);
    }

    // MenuItem 클래스를 List로 관리




    // List에 들어있는 MenuItem을 순차적으로 보여주는 함수
    for(int i=0; i<menuItems.size(); i++){

    }

    // List를 리턴하는 함수

    // 구조에 맞게 함수를 선언해놓고 가져다 사용하세요.
}
