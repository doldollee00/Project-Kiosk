package Challenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private List<Menu> menu = new ArrayList<>();
    private List<MenuItem> bag = new ArrayList<>();

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
                System.out.println((i + 1) + ". " + bigMenu.getItemName());
            }
            if(bag.size() != 0){
                System.out.println("");
                System.out.println("[ ORDER MENU ]");
                System.out.println("4. Orders\t\t | 장바구니를 확인 후 주문합니다.");
                System.out.println("5. Cancel\t\t | 진행중인 주문을 취소합니다.");
            }

            // 숫자를 입력 받기
            System.out.print("어떤 메뉴를 선택하시겠어요? (0은 종료) : ");
            int number1 = sc.nextInt();
            System.out.println("");

            // 입력 받은 숫자가 올바르다면 인덱스로 활용하여 List에 접근하기
            // List<Menu>에 인덱스로 접근하면 Menu만 추출할 수 있겠죠?
            // 인덱스를 활용하여 햄버거 종류를 출력해야 함

            if ((number1 == 4 || number1 == 5) && bag.size() == 0) {
                //throw new IllegalArgumentException("장바구니가 비어 있습니다. 주문 또는 취소를 할 수 없습니다.");
                System.out.println("hello");
            }

            switch (number1) {
                case 1:
                    Menu bigMenu = menu.get(number1 - 1);
                    menuChoice(sc, bigMenu);
                    break;
                case 2:
                    throw new IllegalArgumentException("음료는 없습니다.");
                case 3:
                    throw new IllegalArgumentException("디저트는 없습니다.");
                case 4:
                    showBag(sc);
                    break;
                case 5:
                    bag.clear();
                    System.out.println("가방을 모두 비웠습니다.");
                    break;
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
    public void menuChoice(Scanner sc, Menu bigMenu){
        while(true){
            System.out.println(" [BURGERS MENU] ");
            List<MenuItem> items = bigMenu.getMenuItems();
            for (int i = 0; i < items.size(); i++){
                MenuItem item = items.get(i);
                System.out.println((i + 1) + ". " + item.getName() + "  |  " + item.getPrice() + "  |  " + item.getInfo());
            }

            System.out.print("햄버거 종류를 선택 하세요. (0은 뒤로가기) : ");
            int number2 = sc.nextInt();
            System.out.println("");
            // 숫자 입력 받기
            // 입력 받은 숫자가 올바르다면 인덱스로 활용해서 Menu가 가지고 있는 List<MenuItem>에 접근하기
            // menu.getMenuItems().get(i); 같은 형식으로 하나씩 들어가서 얻어와야 합니다.

            if(number2 == 0){
                break;
            }else if(number2 >1 || number2 < items.size()){
                //MenuItem bigMenu2 = items.get(number2 - 1);
                //System.out.print("선택한 메뉴 : ");
                //System.out.println(bigMenu2.getName() + "  |  " + bigMenu2.getPrice() + "  |  " + bigMenu2.getInfo());

                //장바구니 추가 여부 확인 메서드 불러오기
                addBag(sc, bigMenu, number2);
            }else{
                throw new IllegalArgumentException("번호를 잘 못 입력하셨습니다. 종료합니다.");
            }
        }
    }

    public void addBag(Scanner sc, Menu bigMenu, int number2){
        List<MenuItem> items = bigMenu.getMenuItems();
        MenuItem bigMenu3 = items.get(number2 - 1);
        System.out.println("hello" + bigMenu3.getName() + "  |  " + bigMenu3.getPrice() + "  |  " + bigMenu3.getInfo());
        System.out.println("위 메뉴를 장바구나에 추가하시겠습니까?");
        System.out.println("1. 확인\t\t 2. 취소");
        int number3 = sc.nextInt();

        if(number3 == 1){
            System.out.println("ty! " + bigMenu3.getName() + " 이(가) 장바구니에 추가되었습니다.");
            System.out.println("");
            bag.add(bigMenu3);
        }else if(number3 == 2){
            System.out.println("취소");
            System.out.println("");
        }else{
            throw new IllegalArgumentException("번호를 잘 못 입력하셨습니다. 종료합니다.");
        }
    }

    public void showBag(Scanner sc){
        System.out.println("[ADD BAG MENU] ");
        int result = 0;
        for (int i = 0; i < bag.size(); i++) {
            MenuItem item = bag.get(i);
            System.out.println(item.getName() + "  |  " + item.getPrice() + "  |  " + item.getInfo());
            result += item.getPrice();
        }
        System.out.println("");
        System.out.println("[ Total ]");
        System.out.println(result);

        System.out.println("");
        System.out.println("1. 주문 \t\t 2. 메뉴판");
        int number4 = sc.nextInt();
        if(number4 == 1){
            System.out.println("주문이 완료 되었습니다. 금액은 "+ result + "입니다.");
            bag.clear();
        }
    }
}