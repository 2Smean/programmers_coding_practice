package lsm.level0;

import java.util.Arrays;

public class Lv0_140_2차원으로만들기 {

    public static void main(String[] args) {
        int[] num_list1 = {1, 2, 3, 4, 5, 6, 7, 8};
        int n1 = 2;
        System.out.println(Arrays.deepToString(solution(num_list1, n1)));
    }

    private static int[][] solution(int[] num_list, int n) {
        // 2차원 배열의 행 개수 계산
        int rowCount = num_list.length / n;
        int[][] result = new int[rowCount][n];

        // 2차원 배열 채우기
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = num_list[i * n + j];
            }
        }

        return result;
    }
}
