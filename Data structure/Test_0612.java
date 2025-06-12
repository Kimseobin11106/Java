import java.util.Scanner;

public class Test_0612 {
    static int[][] mdays = {
            {31,28,31,30,31,30,31,30,31,30,31,30},
            {31,29,31,30,31,30,31,30,31,30,31,30}
    };

    static int isleep(int year) {

        return (year%4==0 && year%100 !=0 || year%400 == 0)? 1 : 0;
    }

    static int dayOfYear(int y, int m, int d) {
        int days = d;
        for (int i = 0; i < m-1; i++) {
            days += mdays[isleep(y)][i];
        }

        return days;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("그 해 경과 일수를 구합니다.");
        System.out.println("연도 입력");
        int y = sc.nextInt();
        System.out.println("월 입력");
        int m = sc.nextInt();
        System.out.println("일 입력");
        int d = sc.nextInt();

        System.out.println("그 해의 " + dayOfYear(y,m,d)+ " 일 째 입니다.");

    }
}
