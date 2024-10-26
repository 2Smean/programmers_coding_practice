package lsm.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Lv1_33_두개뽑아서더하기 {

    private static int[] solution(int[] numbers) {
        HashSet<Integer> sumSet = new HashSet<>();

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                sumSet.add(numbers[i] + numbers[j]);
            }
        }

        ArrayList<Integer> resultList = new ArrayList<>(sumSet);
        resultList.sort(null); // 오름차순 정렬

        return resultList.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] numbers2 = {5, 0, 2, 7};
        System.out.println(Arrays.toString(solution(numbers2))); 
    }
}
