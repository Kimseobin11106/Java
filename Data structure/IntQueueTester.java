import java.util.Scanner;

public class IntQueueTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IntQueue s = new IntQueue(5);

        while (true) {
            System.out.println("1:인큐 2:디큐 3:조회 0:종료");

            int menu = sc.nextInt();
            if (menu==0) break;

            int x;
            switch (menu){
                case 1:
                    System.out.print("데이터: ");
                    x= sc.nextInt();
                    try {
                        s.enque(x);
                    } catch(IntQueue.OverflowIntQueueException e) {
                        System.out.println("큐가 가득 찼습니다.");
                    }
                    break;
                case 2:
                    try {
                        x = s.deque();
                    } catch (IntQueue.EmptyIntQueueException e) {
                        System.out.println("큐가 비어있습니다.");
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
