package lsm.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lv1_06_자연수뒤집어배열로만들기 {

    private static int[] solution(long n) {
        List<Integer> answerList = new ArrayList<>();
        String stringN = String.valueOf(n);

        for (int i = stringN.length()-1; i >= 0 ; i--) {
            char ch = stringN.charAt(i);
            answerList.add(Integer.parseInt(String.valueOf(ch)));
        }

        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        long n = 12345;
        System.out.println(Arrays.toString(solution(n)));
    }
}
