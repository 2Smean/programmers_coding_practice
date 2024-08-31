package lsm.level1;

public class Lv1_11_두정수사이의값 {

    private static long solution(int a, int b) {
        // a와 b 중 작은 값을 min, 큰 값을 max로 설정합니다.
        int min = Math.min(a, b);
        int max = Math.max(a, b);

        // min과 max 사이의 모든 정수를 더합니다.
        long sum = 0;
        for (int i = min; i <= max; i++) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(solution(5, 3));
    }
}
