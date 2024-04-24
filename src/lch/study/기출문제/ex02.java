package lch.study.기출문제;

public class ex02 {
    public static void main(String[] args) {
        int money = 4620;


        int a = money/1000;
        int b =  (money%1000)/500;
        int c = (money%500)/100;
        int d = (money%100)/10;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}
