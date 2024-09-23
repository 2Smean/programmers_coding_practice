package lsm.level1;

public class Lv1_26_내적 {

    private static int solution(int[] a, int[] b) {
        int answer = 0;

        for (int i = 0; i < a.length; i++) {
            answer += a[i] * b[i];  // 대응하는 원소들을 곱하고 누적
        }

        return answer;  // 결과 반환
    }

    // main 메서드에서 결과를 확인
    public static void main(String[] args) {
        int[] a2 = {-1, 0, 1};
        int[] b2 = {1, 0, -1};
        System.out.println(solution(a2, b2)); 
    }
}
