public class Ex_31104 {
    public static void main(String[] args) {
        double[] num = {1.0,2.0,3.0,4.0,5.0};

        for (int i = 0; i < num.length; i++) {
            System.out.println("num[" + i + "] = " + num[i]);
//            System.out.printf("num[%d] = %.1f\n",i,num[i]);
        }
        double sum = 0;
        for(double i:num)
            sum +=i;

        System.out.println("모든 요소의 값은 " + sum + "입니다.");
    }
}
