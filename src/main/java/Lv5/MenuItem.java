package Lv5;

public class MenuItem {
    // 이름, 가격, 설명 필드 선언하여 관리
    private String name;    //이름
    private int price;      //가격
    private String info;    //설명

    public MenuItem(String name, int price, String info) {
        this.name = name;
        this.price = price;
        this.info = info;
    }

    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public String getInfo() {
        return info;
    }
}
