package lsm.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lv0_54_뒤에서5등까지 {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(Arrays.toString(solution(list)));
    }
    private static int[] solution(int[] list) {
        List<Integer> answerList = new ArrayList<>();

        Arrays.sort(list);

        for(int i=0;i<list.length;i++){
            if(i<5){
                answerList.add(list[i]);
            }
        }

        int[] answer = new int[answerList.size()];
        for(int i=0;i<answerList.size();i++){
            answer[i] = answerList.get(i);
        }
        return answer;
    }
}
