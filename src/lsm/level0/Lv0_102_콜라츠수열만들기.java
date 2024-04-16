package lsm.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lv0_102_콜라츠수열만들기 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(Arrays.toString(solution(n)));
    }
    private static int[] solution(int n) {
        List<Integer> answerList = new ArrayList<>();
        answerList.add(n);

        for (; n != 1; ) {
            if (n % 2 == 0) {
                n = n /2;
            }else{
                n = 3 * n + 1;
            }
            answerList.add(n);
        }

        int[] answer = new int[answerList.size()];
        for(int i=0;i<answerList.size();i++){
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}
