package demo;

import java.util.Random;
import java.util.Scanner;
public class rendom {
    public static void main(String[] args) {
        for (int i = 0;i<5;i++) {
            Random r = new Random();
            int data = r.nextInt(100) + 1;
            Scanner sc = new Scanner(System.in);
            for (; ; ) {
                System.out.println("请输入数字：");
                int number = sc.nextInt();
                System.out.println(number);
                if (number < data) {
                    System.out.println("您输入的数字过小：");
                } else if (number > data) {
                    System.out.println("您输入的数字过大：");
                } else {
                    System.out.println("恭喜您，猜对了：");
                    break;
                }
            }
        }
    }
}

