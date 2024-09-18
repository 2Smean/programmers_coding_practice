package lsm.level1;

import java.util.Arrays;

public class Lv1_21_행렬의덧셈 {

    private static int[][] solution(int[][] arr1, int[][] arr2) {
        // 결과를 저장할 행렬 생성 (arr1과 같은 크기)
        int[][] result = new int[arr1.length][arr1[0].length];

        // 이중 반복문을 통해 각 요소를 더한 값을 result에 저장
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                result[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] arr1 = {{1, 2}, {2, 3}};
        int[][] arr2 = {{3, 4}, {5, 6}};
        System.out.println(Arrays.deepToString(solution(arr1, arr2)));
    }
}
