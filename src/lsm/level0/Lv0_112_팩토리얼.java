package lsm.level0;

public class Lv0_112_팩토리얼 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(solution(n));
    }
    private static int solution(int n) {
        int factorial = 1;
        int i = 1;

        // 팩토리얼 값을 계산하여 n보다 작거나 같은 경우까지 반복
        while (factorial <= n) {
            i++; // i를 1씩 증가시키면서
            factorial *= i; // 팩토리얼 값을 갱신
        }

        // 이때의 i가 조건을 만족하는 가장 큰 정수임
        return i - 1;
    }
}
