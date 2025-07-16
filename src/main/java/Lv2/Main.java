package Lv2;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello, Kiosk!");
        Scanner sc = new Scanner(System.in);

        List<String> name = new ArrayList<>();
        List<Integer> price = new ArrayList<>();
        List<String> info = new ArrayList<>();

        while(true){
            //버거 메뉴 만들기
            System.out.print("버거 이름을 입력하세요. : ");
            String burgerName = sc.next();
            System.out.print("버거 가격을 입력하세요. : ");
            int burgerPrice = sc.nextInt();
            sc.nextLine();
            System.out.print("버거 설명을 입력하세요. : ");
            String burgerInfo = sc.nextLine();

            name.add(burgerName);
            price.add(burgerPrice);
            info.add(burgerInfo);

            System.out.println("[ DingaBurger Menu ]");

            for(int i=0; i<name.size(); i++){
                System.out.println(i + ".  " + name.get(i) + "\t| W " + price.get(i) + "\t| " + info.get(i));
            }
            System.out.println("0.  종료 \t\t| 종료");
            int endBunho = sc.nextInt();
            if (endBunho == 0) {
                break;
            }
        }
    }
}
