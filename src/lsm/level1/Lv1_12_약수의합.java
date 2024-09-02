package lsm.level1;

public class Lv1_12_약수의합 {

    private static int solution(int n) {
        int sum = 0;

        // 1부터 n까지의 모든 수에 대해 약수인지 확인
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {  // i가 n의 약수인지 확인
                sum += i;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(solution(12));  
    }
}
