package lsm.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lv0_53_n번째원소까지 {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5, 6, 7};
        int n = 2;
        System.out.println(Arrays.toString(solution(list,n)));
    }
    private static int[] solution(int[] list, int n) {
        List<Integer> answerList = new ArrayList<>();

        for(int i=0;i<n;i++){
            answerList.add(list[i]);
        }

        int[] answer = new int[answerList.size()];
        for(int i=0;i<answerList.size();i++){
            answer[i] = answerList.get(i);
        }
        return answer;
    }
}
