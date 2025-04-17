import java.util.Scanner;

public class Test_31104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("배열에 값을 어느정도 넣을 껀가요?"); int a = sc.nextInt();

        int[] num = new int[a];

        for (int i=0; i<num.length; i++) {
            System.out.println((i+1) + "에 넣을 값을 입력하세요.");
            num[i] = sc.nextInt();
        }

        int amount = 0;
        for (int i=0; i<num.length; i++) {
            System.out.println(num[i]);
            amount += num[i];
        }

        System.out.println("총 값 : " + amount);

    }
}
