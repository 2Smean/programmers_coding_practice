package lsm.level0;

import java.util.ArrayList;
import java.util.Arrays;
/* 잘 이해가 가지 않아서 다시 풀어봐야할거같다*/
public class Lv0_30_n의배수고르기 {
    public static void main(String[] args) {
        int n = 3;
        int[] numlist = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(solution(n,numlist)));
    }
    private static int[] solution(int n, int[] numlist) {
        ArrayList<Integer> answerList = new ArrayList<>();

        for(int num : numlist){
            if(num % n == 0){
                answerList.add(num);
            }
        }
        int[] answer =new int[answerList.size()];

        for(int i=0;i<answerList.size();i++){
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}
