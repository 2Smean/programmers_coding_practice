package lsm.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lv0_106_문자열정렬하기 {
    public static void main(String[] args) {
        String str = "BcAdd";
        System.out.println(solution(str));
    }
    private static String solution(String str) {
        str = str.toLowerCase();

        int length = str.length();

        char[] chArr = new char[length];
        for(int i=0;i<length;i++){
            chArr[i] = str.charAt(i);
        }

        Arrays.sort(chArr);

        StringBuilder answer = new StringBuilder();
        for(int i=0;i<length;i++){
            answer.append(chArr[i]);
        }
        return answer.toString();
    }
}
