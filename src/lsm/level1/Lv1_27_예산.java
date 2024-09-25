package lsm.level1;

import lch.BOJ.dfs.Solution;

import java.util.Arrays;

public class Lv1_27_예산 {

    private static int solution(int[] d, int budget) {
        // 부서별 신청 금액을 오름차순으로 정렬
        Arrays.sort(d);

        int count = 0;  // 지원해줄 수 있는 부서의 수
        int sum = 0;    // 현재까지 사용한 금액의 합

        // 신청 금액을 순서대로 더하면서 예산을 초과하지 않는지 확인
        for (int i = 0; i < d.length; i++) {
            sum += d[i];
            if (sum > budget) {  // 예산을 초과하면 종료
                break;
            }
            count++;  // 예산 안에 들어가면 지원 가능한 부서 수를 증가
        }

        return count;
    }

    // main 메서드에서 결과를 확인
    public static void main(String[] args) {
        int[] d2 = {2, 2, 3, 3};
        int budget2 = 10;
        System.out.println(solution(d2, budget2));
    }
}
