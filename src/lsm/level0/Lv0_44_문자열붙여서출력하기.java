package lsm.level0;

import java.util.Scanner;
/*Scanner 문제는 sout 으로 출력
* charAt 으로 바꾸게 되면 빈문자열 삭제된다*/
public class Lv0_44_문자열붙여서출력하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String mix =  a+b;
        for(int i=0;i<mix.length();i++){
            char ch = mix.charAt(i);
            System.out.print(ch);
        }
    }
}
