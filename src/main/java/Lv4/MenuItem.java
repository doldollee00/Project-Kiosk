package Lv4;

public class MenuItem {
    // 이름, 가격, 설명 필드 선언하여 관리
    String name;    //이름
    int price;      //가격
    String info;    //설명

    public MenuItem(String name, int price, String info) {
        this.name = name;
        this.price = price;
        this.info = info;
    }
}
