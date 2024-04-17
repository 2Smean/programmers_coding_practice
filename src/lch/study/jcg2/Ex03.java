package lch.study.jcg2;

public class Ex03 {
    public static void main(String[] args) {
        int m = 4620;

        int a = m/1000;
        int b = (m%1000)/500;
        int c = (m%500)/100;
        int d = (m%100)/10;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}
