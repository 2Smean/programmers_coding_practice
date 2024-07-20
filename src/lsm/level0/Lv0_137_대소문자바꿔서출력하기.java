package lsm.level0;

import java.util.Scanner;

public class Lv0_137_대소문자바꿔서출력하기 {

    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        for (char ch : str.toCharArray()) {
            // 대문자는 소문자로 변환
            if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            }
            // 소문자는 대문자로 변환
            else if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch));
            }
        }

        System.out.println(result.toString());
    }
}
