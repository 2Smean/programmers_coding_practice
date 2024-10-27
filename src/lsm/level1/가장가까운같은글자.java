package lsm.level1;

import java.util.Arrays;
import java.util.HashMap;

public class 가장가까운같은글자 {

    private static int[] solution(String s) {
        int[] result = new int[s.length()];
        HashMap<Character, Integer> lastSeen = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if (lastSeen.containsKey(currentChar)) {
                result[i] = i - lastSeen.get(currentChar);
            } else {
                result[i] = -1;
            }

            lastSeen.put(currentChar, i);
        }

        return result;
    }

    public static void main(String[] args) {
        String s2 = "foobar";
        System.out.println(Arrays.toString(solution(s2)));
    }
}
