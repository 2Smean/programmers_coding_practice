package lsm.level1;

import java.util.Arrays;

public class Lv1_25_x만큼간격이있n개의숫자 {

    private static long[] solution(int x, int n) {
        long[] answer = new long[n];  // 결과를 저장할 배열
        long current = x;  // 현재 숫자

        // x부터 시작하여 x씩 증가하는 숫자를 n개 생성
        for (int i = 0; i < n; i++) {
            answer[i] = current;
            current += x;
        }

        return answer;
    }

    // main 메서드에서 결과를 확인
    public static void main(String[] args) {
        // 테스트 케이스 3
        System.out.println(Arrays.toString(solution(-4, 2))); 
    }
}
