package algorithms.bigO;

import java.util.Arrays;

public class BigO1 {

    public static void main(String[] args) {
        int n = 12;
        int[] array = {1,5,6,47,9,4,2,5,3,6,7,5,4,5,6,7,8,5,4,3,5,49};
        System.out.println(ComPareToMax(array,n));

        System.out.println(ComPareToAll(array,n));
    }

    private static int ComPareToMax(int array[], int n) {
        int curMax, i;

        /* 배열에 적어도 하나 이상의 원소가 있는지 확인*/
        if (n <= 0) {
            return -1;
        }

        // 지금까지 확인한 값 중 최대값을 저장할 변수에 배열의 첫 번째 값 저장
        curMax = array[0];

        // 모든 수를 최대값과 비교함
        for (i = 1; i < n; i++) {
            if (array[i] > curMax) {
                curMax = array[i];
            }
        }
        return curMax;
    }

    private static int ComPareToAll(int array[], int n) {
        int i, j;
        boolean isMax;

        // 배열에 적어도 하나 이상의 원소가 있는지 확인
        if (n <= 0) {
            return -1;
        }

        for (i = n - 1; i > 0; i--) {
            isMax = true;
            for (j = 0; j < n; j++) {
                // 더 큰 값이 있는지 확인
                if (array[j] > array[i]) {
                    isMax = false; // array[i]가 최대값이 아님
                }
            }
            if (isMax) {
                break;
            }
        }
        return array[i];
    }
}
