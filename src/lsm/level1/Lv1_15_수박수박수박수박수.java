package lsm.level1;

public class Lv1_15_수박수박수박수박수 {

    private static String solution(int n) {
        StringBuilder result = new StringBuilder();

        // n만큼 "수박"을 반복
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                result.append("수");
            } else {
                result.append("박");
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution(4));
    }
}
