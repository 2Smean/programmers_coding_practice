package lsm.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lv0_104_약수구하기 {
    public static void main(String[] args) {
        int n = 24;
        System.out.println(Arrays.toString(solution(n)));
    }
    private static int[] solution(int n) {
        List<Integer> answerList = new ArrayList<>();

        for(int i=1;i<=n;i++){
            if(n % i == 0){
                answerList.add(i);
            }
        }

        int[] answer = new int[answerList.size()];
        for(int i=0;i<answerList.size();i++){
            answer[i] = answerList.get(i);
        }

        Arrays.sort(answer);

        return answer;
    }
}
