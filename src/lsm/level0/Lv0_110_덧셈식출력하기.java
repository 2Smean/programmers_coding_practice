package lsm.level0;

import java.util.Scanner;

public class Lv0_110_덧셈식출력하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = a + b;

        System.out.println(a + " + " + b + " = " + c);
    }
}
