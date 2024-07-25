package lsm.level0;

public class Lv0_143_수조작하기2 {
    public static void main(String[] args) {
        int[] numLog = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};
        System.out.println(solution(numLog)); // R
    }

    public static String solution(int[] numLog) {
        StringBuilder result = new StringBuilder();

        for (int i = 1; i < numLog.length; i++) {
            int diff = numLog[i] - numLog[i - 1];
            if (diff == 1) {
                result.append("w");
            } else if (diff == -1) {
                result.append("s");
            } else if (diff == 10) {
                result.append("d");
            } else if (diff == -10) {
                result.append("a");
            }
        }

        return result.toString();
    }
}
