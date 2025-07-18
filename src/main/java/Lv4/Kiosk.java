package Lv4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {

    public Kiosk() {}

    public void start() {
        // 스캐너 선언
        Scanner sc = new Scanner(System.in);
        // 반복문 시작
        System.out.println("------------------------------------");
        while (true) {
            // List와 Menu 클래스 활용하여 상위 카테고리 메뉴 출력
            List<Menu> menu = new ArrayList<>();
            for(int i=0; i<menu.size();i++) {
                Menu bigManu = menu.get(i);
            }

            // 숫자를 입력 받기
            System.out.println("번호를 선택 하세요. (0은 종료) : ");
            int number1 = sc.nextInt();

            // 입력 받은 숫자가 올바르다면 인덱스로 활용하여 List에 접근하기
            // List<Menu>에 인덱스로 접근하면 Menu만 추출할 수 있겠죠?
            switch (number1) {
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
                default:
                    throw new IllegalArgumentException("번호를 잘 못 입력하셨습니다. 종료합니다.");
            }
            // 프로그램을 종료
            if (number1 == 0) {
                System.out.println("종료");
                break;
            }
            System.out.println("번호를 선택 하세요. (0은 종료) : ");
            int number1 = sc.nextInt();
            // 입력된 숫자에 따른 처리
            // 선택한 메뉴 : 이름, 가격, 설명
            switch (number2) {
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
                default:
                    throw new IllegalArgumentException("번호를 잘 못 입력하셨습니다. 종료합니다.");
            }
            // 프로그램을 종료
            if (number2 == 0) {
                System.out.println("종료");
                break;
            }
        }





        // Menu가 가진 List<MenuItem>을 반복문을 활용하여 햄버거 메뉴 출력

        // 숫자 입력 받기
        // 입력 받은 숫자가 올바르다면 인덱스로 활용해서 Menu가 가지고 있는 List<MenuItem>에 접근하기
        // menu.getMenuItems().get(i); 같은 형식으로 하나씩 들어가서 얻어와야 합니다.
    }
}
