package lsm.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lv0_79_문자열정렬하기1 {
    public static void main(String[] args) {
        String str = "a876d786";
        System.out.println(Arrays.toString(solution(str)));
    }
    private static int[] solution(String str) {
        List<Integer> answerList = new ArrayList<>();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                int digit = Integer.parseInt(String.valueOf(ch));
                answerList.add(digit);
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
