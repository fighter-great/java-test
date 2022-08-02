package demo;

public class demo6 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum+=i;
        }
        //1~10 相加之和
        System.out.println(sum);
        int sum1 = 0;
        for (int j = 1; j <=10; j++) {
            if (j%2 == 1) {
                sum1+=j;
            }


        }
        //1~10 之间的奇数之和
        System.out.println(sum1);
        int sum2 = 0;
        for (int k = 1; k <= 10; k+=2) {
            sum2+=k;
        }
        System.out.println(sum2);
    }
}
