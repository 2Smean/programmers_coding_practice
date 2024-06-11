package lsm.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lv0_127_세개의구분자 {
    public static void main(String[] args) {
        String str = "baconlettucetomato";
        System.out.println(Arrays.toString(solution(str)));
    }
    private static String[] solution(String str) {
        List<String> answerList = new ArrayList<>();
        StringBuilder temp = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'b' || ch == 'c') {
                if (temp.length() > 0) {
                    answerList.add(temp.toString());
                    temp.setLength(0);
                }
            } else {
                temp.append(ch);
            }
        }
        if (temp.length() > 0) {
            answerList.add(temp.toString());
        }

        if (answerList.isEmpty()) {
            return new String[]{"EMPTY"};
        }

        String[] answer = new String[answerList.size()];
        answer = answerList.toArray(answer);

        return answer;
    }
}
