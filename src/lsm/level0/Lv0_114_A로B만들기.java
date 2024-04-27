package lsm.level0;

import java.util.Arrays;

public class Lv0_114_A로B만들기 {
    public static void main(String[] args) {
        String be = "ellppa";
        String af = "apple";
        System.out.println(solution(be,af));
    }
    private static int solution(String before, String after) {
        char[] beforeChars = before.toCharArray();
        char[] afterChars = after.toCharArray();
        Arrays.sort(beforeChars);
        Arrays.sort(afterChars);

        return Arrays.equals(beforeChars, afterChars) ? 1 : 0;
    }
}
