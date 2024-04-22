package lsm.level0;

public class Lv0_109_369게임 {
    public static void main(String[] args) {
        int order = 3;
        System.out.println(solution(order));
    }
    private static int solution(int order) {
        String orderString = String.valueOf(order);
        int clapCount = 0;

        for (int i = 0; i < orderString.length(); i++) {
            char digit = orderString.charAt(i);
            if (digit == '3' || digit == '6' || digit == '9') {
                clapCount++;
            }
        }

        return clapCount;
    }
}
