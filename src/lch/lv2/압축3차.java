package lch.lv2;

import java.util.HashMap;
import java.util.Map;

public class 압축3차 {

    /**
     * 문제 이해가 안가 아 도대체 뭔소리야..
     * @param args
     */
    public static void main(String[] args) {
        String msg = "KAKAO";
        System.out.println(solution(msg));
    }

    private static int[] solution(String msg){
        Map<String,Integer> dictionary = new HashMap<>();

        char word = 'A';
        for (int i = 1; i <= ('Z' - 'A') + 1; i++) {
            dictionary.put(word + "", i);
            word += 1;
        }

        /**
         * K = 11
         * A = 1
         * KA = 
         */

        return new int[0];
    }
}
