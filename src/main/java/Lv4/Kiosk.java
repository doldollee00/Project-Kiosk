package Lv4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    List<Menu> menu = new ArrayList<>();

    public Kiosk(List<Menu> menu) {
        this.menu = menu;
    }

    public void start() {

        // 스캐너 선언
        Scanner sc = new Scanner(System.in);
        // 반복문 시작
        while (true) {
            System.out.println("------------------------------------");
            System.out.println("[ MAIN MENU ]");

            // List와 Menu 클래스 활용하여 상위 카테고리 메뉴 출력
            for (int i = 0; i < menu.size(); i++) {
                Menu bigMenu = menu.get(i);
                System.out.println((i + 1) + ". " + bigMenu.itemName);
            }

            // 숫자를 입력 받기
            System.out.println("어떤 메뉴를 선택하시겠어요? (0은 종료) : ");
            int number1 = sc.nextInt();

            // 입력 받은 숫자가 올바르다면 인덱스로 활용하여 List에 접근하기
            // List<Menu>에 인덱스로 접근하면 Menu만 추출할 수 있겠죠?
            // 인덱스를 활용하여 햄버거 종류를 출력해야 함
            Menu bigMenu = menu.get(number1 - 1);

            switch (number1) {
                case 1:
                    menuChoice(sc, bigMenu);
                    break;
                case 2:
                    throw new IllegalArgumentException("음료는 없습니다.");
                case 3:
                    throw new IllegalArgumentException("디저트는 없습니다.");
                default:
                    throw new IllegalArgumentException("번호를 잘 못 입력하셨습니다. 종료합니다.");
            }
            // 프로그램을 종료
            if (number1 == 0) {
                System.out.println("종료");
                break;
            }
        }
    }

    // Menu가 가진 List<MenuItem>을 반복문을 활용하여 햄버거 메뉴 출력
    public static void menuChoice(Scanner sc, Menu bigMenu){
        while(true){
            System.out.println(" [BURGERS MENU] ");
            List<MenuItem> items = bigMenu.getMenuItems();
            for (int i = 0; i < items.size(); i++){
                MenuItem item = items.get(i);
                System.out.println((i + 1) + ". " + item.name + "  |  " + item.price + "  |  " + item.info);
            }

            System.out.println("햄버거 종류를 선택 하세요. (0은 뒤로가기) : ");
            int number2 = sc.nextInt();
            // 숫자 입력 받기
            // 입력 받은 숫자가 올바르다면 인덱스로 활용해서 Menu가 가지고 있는 List<MenuItem>에 접근하기
            // menu.getMenuItems().get(i); 같은 형식으로 하나씩 들어가서 얻어와야 합니다.

            if(number2 == 0){
                break;
            }else if(number2 >1 || number2 < items.size()){
                MenuItem bigMenu2 = items.get(number2 - 1);

                System.out.print("선택한 메뉴 : ");
                System.out.println(bigMenu2.name + "  |  " + bigMenu2.price + "  |  " + bigMenu2.info);
                System.out.println("");
            }else{
                throw new IllegalArgumentException("번호를 잘 못 입력하셨습니다. 종료합니다.");
            }
        }
    }
}