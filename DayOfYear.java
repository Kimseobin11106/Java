import java.util.Scanner;

public class DayOfYear {

    // 평년과 윤년의 배열을 저장
    static int[][] mdays = {
            {31,28,31,30,31,30,31,30,31,30,31,30}, // 평년
            {31,29,31,30,31,30,31,30,31,30,31,30}  // 윤년
    };

    // 윤년 판독
    static int isleep(int year) {

        return (year%4==0 && year%100 !=0 || year%400 == 0)? 1 : 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("연도 입력");
        int year = sc.nextInt();

        System.out.println("월 입력");
        int month = sc.nextInt();

        System.out.println("일 입력");
        int day = sc.nextInt();

        int dayamount = 0; // 경과 일 수

        for (int i=0; i < month - 1; i++) {
            dayamount += mdays[isleep(year)][i];
        }

        System.out.println(year + "년" + month + "월" + day + "일은 " + "그 해의 " + dayamount + "번째 날입니다.");
    }
}
