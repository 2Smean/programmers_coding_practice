package lsm.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lv0_82_가장큰수찾기 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(solution(array)));
    }
    private static int[] solution(int[] array) {
        List<Integer> answerList = new ArrayList<>();
        int max = Integer.MIN_VALUE;

        for (int i=0;i<array.length;i++){
            if(array[i] > max){
                max = array[i];
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) {
                answerList.add(max);
                answerList.add(i);
            }
        }

        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        return answer;
    }
}
