package demo;

public class demo2 {
    public static void main(String[] args) {
        int a=123;

        //个位
        int ge=a%10;
        System.out.println(ge);
        //十位
        int shi=a/10%10;
        System.out.println(shi);
        //百位
        int bai=a/100;
        System.out.println(bai);
    }
}
