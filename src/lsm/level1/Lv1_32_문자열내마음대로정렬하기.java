package lsm.level1;

import java.util.Arrays;
import java.util.Comparator;

public class Lv1_32_문자열내마음대로정렬하기 {

    private static String[] solution(String[] strings, int n) {
        // Comparator를 사용하여 n번째 문자를 기준으로 정렬
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                // n번째 문자를 비교
                if (s1.charAt(n) == s2.charAt(n)) {
                    // n번째 문자가 같다면 사전순으로 비교
                    return s1.compareTo(s2);
                } else {
                    // n번째 문자가 다르다면 해당 문자끼리 비교
                    return Character.compare(s1.charAt(n), s2.charAt(n));
                }
            }
        });
        return strings;
    }

    public static void main(String[] args) {
        String[] strings2 = {"abce", "abcd", "cdx"};
        int n2 = 2;
        System.out.println(Arrays.toString(solution(strings2, n2)));
    }
}
