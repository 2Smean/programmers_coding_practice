package lsm.level1;

import java.util.Arrays;

public class Lv1_24_없는숫자더하기 {

    private static int solution(int[] numbers) {
x        int totalSum = 45;

        int sumOfNumbers = Arrays.stream(numbers).sum();

        return totalSum - sumOfNumbers;
    }

    // main 메서드에서 결과를 확인
    public static void main(String[] args) {
        int[] numbers2 = {5, 8, 4, 0, 6, 7, 9};
        System.out.println(solution(numbers2));
    }
}
