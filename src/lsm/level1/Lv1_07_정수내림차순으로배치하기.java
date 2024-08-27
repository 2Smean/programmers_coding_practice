package lsm.level1;

import java.util.Arrays;
import java.util.Collections;

public class Lv1_07_정수내림차순으로배치하기 {

    private static long solution(long n) {
        String numStr = Long.toString(n);

        String[] digits = numStr.split("");

        Arrays.sort(digits, Collections.reverseOrder());

        String sortedNumStr = String.join("", digits);

        return Long.parseLong(sortedNumStr);
    }

    public static void main(String[] args) {
        long n = 12345;
        System.out.println(solution(n));
    }
}
