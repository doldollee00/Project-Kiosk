package Lv5;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private String itemName;

    public Menu(String itemName) {
        this.itemName = itemName;
    }

    // MenuItem 클래스를 List로 관리
    private List<MenuItem> menuItems = new ArrayList<>();
    public void burgeris(MenuItem menuI){
        menuItems.add(menuI);
    }

    // List에 들어있는 MenuItem을 순차적으로 보여주는 함수
    public void menulist(){
        for(int i=0; i<menuItems.size(); i++) {
            MenuItem menulists = menuItems.get(i);
            System.out.println((i + 1) + ". " + menulists.getName() + "  |  " + menulists.getPrice() + "  |  " + menulists.getInfo());
        }
    }
    // List를 리턴하는 함수
    public List<MenuItem> getMenuItems() {
        return menuItems;
    }
    public String getItemName() {
        return itemName;
    }

    // 구조에 맞게 함수를 선언해놓고 가져다 사용하세요.
}
