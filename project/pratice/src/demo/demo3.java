package demo;

public class demo3 {
    public static void main(String[] args){
        int c=10;
        int d=5;
        int rs3=c++ + ++c - --d - ++d + 1 + c--;
        System.out.println(rs3);//26
        System.out.println(c);//11
        System.out.println(d);//5
    }
}
