import java.util.Scanner;

public class ex2_31104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int[][] daysInMonth = {
                {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, // 평년
                {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}  // 윤년
        };


        System.out.print("연도 입력: ");
        int year = sc.nextInt();


        int month;
        while (true) {
            System.out.print("월 입력: ");
            month = sc.nextInt();
            if (month >= 1 && month <= 12) {
                break;
            }
            System.out.println("1~12 중에 숫자만 입력해주십쇼.");
        }

        int day;
        while (true) {
            System.out.print("일 입력: ");
            day = sc.nextInt();
            if (day >= 1 && day <= 31) {
                break;
            }
            System.out.println("1~31 중에 숫자만 입력해주십쇼.");
        }


        // 윤년은 4로 나누어 떨어지는 해, 그리고 100으로 나누어 떨어지지 않는 해, 또는 400으로 나누어 떨어지는 해이다.
        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        int leapIndex = isLeap ? 1 : 0; // true(윤년) : false(평년)


        int dayOfYear = 0;
        for (int i = 0; i < month - 1; i++) {
            dayOfYear += daysInMonth[leapIndex][i];
        }
        dayOfYear += day;


        System.out.println(year + "년 " + month + "월 " + day + "일은 그 해의 " + dayOfYear + "번째 날입니다.");
    }
}

