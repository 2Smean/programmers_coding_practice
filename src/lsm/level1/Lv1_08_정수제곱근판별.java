package lsm.level1;

public class Lv1_08_정수제곱근판별 {

    private static long solution(long n) {
        // n의 제곱근을 구합니다.
        long sqrt = (long) Math.sqrt(n);

        // 제곱근을 제곱하여 원래 수와 비교합니다.
        if (sqrt * sqrt == n) {
            // 제곱근이 n과 같다면 (sqrt + 1)의 제곱을 반환
            return (sqrt + 1) * (sqrt + 1);
        } else {
            // 제곱근이 n과 같지 않다면 -1을 반환
            return -1;
        }
    }

    public static void main(String[] args) {
        long n = 121;
        System.out.println(solution(n));
    }
}
