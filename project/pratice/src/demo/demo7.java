package demo;

public class demo7 {
    public static void main(String[] args) {
//找出水仙花数  是一个三位数，它的个位十位百位的立方和是原数
//        for (int i = 100; i <=999; i++) {
//            int a = i%10;
//            int b = i/10%10;
//            int c = i/100;
//            int sxh = 0;
//            if(a*a*a+b*b*b+c*c*c == i){
//                sxh = i;
//                System.out.println(sxh);
//            }

//        }
        //纸张折叠多少次会和珠穆朗玛峰高度一样，且折叠后的纸张厚度是多少
        double peakHeight = 8848860;
        double paperThickness = 0.1;
        int count = 0;
        while(paperThickness<peakHeight){
            paperThickness *= 2;
            count++;
        }
        System.out.println("折叠的次数："+count);
        System.out.println("纸张的厚度：" + paperThickness);
    }
}
