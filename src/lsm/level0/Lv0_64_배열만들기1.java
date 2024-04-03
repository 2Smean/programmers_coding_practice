package lsm.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lv0_64_배열만들기1 {
    public static void main(String[] args) {
        int n = 10;
        int k = 3;
        System.out.println(Arrays.toString(solution(n,k)));
    }
    private static int[] solution(int n, int k) {
        List<Integer> answerList = new ArrayList<>();

        for(int i=1;i<=n;i++){
            if(i % k == 0){
                answerList.add(i);
            }
        }

        int[] answer = new int[answerList.size()];
        for(int i=0;i<answerList.size();i++){
            answer[i] = answerList.get(i);
        }
        return answer;
    }
}
