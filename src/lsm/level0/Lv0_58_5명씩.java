package lsm.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lv0_58_5명씩 {
    public static void main(String[] args) {
        String[] names = {"j", "e", "e", "d", "r", "q", "e"};
        System.out.println(Arrays.toString(solution(names)));
    }
    private static String[] solution(String[] names) {
        List<String> answerList = new ArrayList<>();

        for(int i=0;i<names.length;i = i + 5){
            answerList.add(names[i]);
        }

        String[] answer = new String[answerList.size()];
        answer = answerList.toArray(answer);
        return answer;
    }
}
