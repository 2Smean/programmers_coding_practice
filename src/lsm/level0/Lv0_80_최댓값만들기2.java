package lsm.level0;

import java.util.Arrays;

public class Lv0_80_최댓값만들기2 {
    public static void main(String[] args) {
        int[] numbers = {1, -5, 3, 4, -3};
        System.out.println(solution(numbers));
    }
    private static int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        int length = numbers.length;

        int max = numbers[length-1] * numbers[length-2];
        int max2 = numbers[0] * numbers[1];

        answer = max2 > max ? max2 : max;
        return answer;
    }
}
