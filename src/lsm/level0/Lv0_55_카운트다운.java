package lsm.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lv0_55_카운트다운 {
    public static void main(String[] args) {
        int start = 10;
        int end = 2;
        System.out.println(Arrays.toString(solution(start, end)));
    }
    private static int[] solution(int start, int end) {
        List<Integer> answerList = new ArrayList<>();

        for(int i=start;i>=end;i--){
            answerList.add(i);
        }

        int[] answer = new int[answerList.size()];
        for(int i=0;i<answerList.size();i++){
            answer[i] = answerList.get(i);
        }
        return answer;
    }
}
