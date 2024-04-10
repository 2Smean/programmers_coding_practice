package lsm.level0;

public class Lv0_76_순서쌍의개수 {
    public static void main(String[] args) {

    }
    private static int solution(int n) {
        int answer = 0;

        // 1부터 n까지 나눌 수 있는 숫자를 찾음
        for (int a = 1; a <= n; a++) {
            // 나누어 떨어지는지 확인
            if (n % a == 0) {
                // a로 나눈 몫이 자연수인지 확인
                int b = n / a;
                if (b > 0) {
                    answer++;
                }
            }
        }

        return answer;
    }
}
