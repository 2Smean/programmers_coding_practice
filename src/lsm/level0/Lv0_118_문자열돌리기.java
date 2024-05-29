package lsm.level0;

import java.util.Scanner;

public class Lv0_118_문자열돌리기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            System.out.println(ch);
        }
    }
}
