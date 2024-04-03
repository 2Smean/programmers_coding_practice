package lsm.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*공백으로 구분하기1 과 비슷한 로직이지만 빈문자열이 처음과 마지막에도 있으므로
* 조건을 주어서 확인하고 List에 추가한다*/
public class Lv0_70_공백으로구분하기2 {
    public static void main(String[] args) {
        String str = "  i love you ";
        System.out.println(Arrays.toString(solution(str)));
    }
    private static String[] solution(String str) {
        List<String> answerList = new ArrayList<>();
        StringBuilder temporary = new StringBuilder();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch != ' '){
                temporary.append(ch);
            }else{
                if (temporary.length() > 0) {
                answerList.add(temporary.toString());
                temporary.setLength(0);
                }
            }
        }
        if(temporary.length() > 0) {
            answerList.add(temporary.toString());
        }

        String[] answer = new String[answerList.size()];
        answer = answerList.toArray(answer);
        return answer;
    }
}
