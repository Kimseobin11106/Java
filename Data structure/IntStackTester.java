import java.util.Scanner;

public class IntStackTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("배열의 크기를 말씀해주세요."); int len = sc.nextInt();

        IntStack s = new IntStack(len);

        while(true) {
            System.out.println("1:푸시 2:팝 3:조회 0:종료");

            int menu = sc.nextInt();
            int x;
            if(menu==0) {
                break;
            }

            switch (menu) {
                case 1:
                    System.out.println("넣을 데이터를 입력하시오");
                    x = sc.nextInt();
                    try{
                        s.push(x);
                    }catch (IntStack.OverflowIntStackException e) {
                        System.out.println("스택이 가득 찼습니다.");
                    }
                    break;
                case 2:
                    try{
                        x = s.pop();
                        System.out.println("데이터 : " + x + "가 삭제되었습니다.");
                    }catch (IntStack.EmptyStackException e) {
                        System.out.println("스택이 비어있습니다.");
                    }
                    break;
                case 3:
                    s.dump();
                    break;
                default:
                    System.out.println("잘못 입력하셨습니다. (1~3)");
                    continue;

            }
        }
    }
}
