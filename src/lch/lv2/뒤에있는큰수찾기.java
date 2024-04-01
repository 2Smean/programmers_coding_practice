package lch.lv2;

import java.util.ArrayList;

/**
 * 시간 초과 풀이
 */
public class 뒤에있는큰수찾기 {

    public static void main(String[] args) {
        int[] numbers = {9, 1, 5, 3, 6, 2};
        System.out.println(solution(numbers));

    }

    private static int[] solution(int[] numbers) {

        ArrayList<Integer> list = new ArrayList<>();


        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            for (int j = i; j < numbers.length; j++) {
                int lateNumber = numbers[j];
                if(number<lateNumber) {
                    list.add(lateNumber);
                    break;
                }
                else {
                    if(j == numbers.length-1){
                        list.add(-1);
                        break;
                    }
                }
            }
        }


        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
