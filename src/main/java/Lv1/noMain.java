package Lv1;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //입력된 메뉴를 저장하는 공간 생성
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

            //.add를 통해 scanner로 받은 값을 List에 저장
            name.add(burgerName);
            price.add(burgerPrice);
            info.add(burgerInfo);

            System.out.println("[ BurgerBurger Menu ]");

            //저장된 메뉴들을 불러오기
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
