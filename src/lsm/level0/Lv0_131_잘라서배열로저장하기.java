package lsm.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lv0_131_잘라서배열로저장하기 {
    public static void main(String[] args) {
        String str = "abc1Addfggg4556b";
        int n = 6;
        System.out.println(Arrays.toString(solution(str,n)));
    }
    private static String[] solution(String str, int n) {
        List<String> answerList = new ArrayList<>();
        StringBuilder temp = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            temp.append(ch);

            if (temp.length() == n) {
                answerList.add(temp.toString());
                temp.setLength(0);
            }
        }
        if (temp.length() > 0) {
            answerList.add(temp.toString());
        }

        String[] answer = new String[answerList.size()];
        answer = answerList.toArray(answer);
        return answer;
    }
}
