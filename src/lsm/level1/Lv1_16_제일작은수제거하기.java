package lsm.level1;

import java.util.Arrays;

public class Lv1_16_제일작은수제거하기 {

    private static int[] solution(int[] arr) {
        // 배열의 길이가 1인 경우 [-1] 반환
        if (arr.length == 1) {
            return new int[] {-1};
        }

        // 가장 작은 값 찾기
        int min = Arrays.stream(arr).min().getAsInt();

        // 가장 작은 값을 제외한 새로운 배열 생성
        return Arrays.stream(arr)
                .filter(num -> num != min)
                .toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[] {4, 3, 2, 1})));
    }
}
