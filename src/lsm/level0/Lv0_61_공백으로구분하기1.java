package lsm.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**/
public class Lv0_61_공백으로구분하기1 {
    public static void main(String[] args) {
        String str = "i love you eunjung";
        System.out.println(Arrays.toString(solution(str)));
    }
    private static String[] solution(String str) {
        List<String> answerList = new ArrayList<>();
        StringBuilder word = new StringBuilder();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch != ' '){
                word.append(ch);//마지막 문자열은 여기에 값이 있게 되어 아래에서 answerList 에 추가해줘야한다
            }else{
                answerList.add(word.toString());
                word.setLength(0); //word초기화
            }
        }

        answerList.add(word.toString());//마지막 문자열 answerList에 추가

        String[] answer = new String[answerList.size()];
        answer = answerList.toArray(answer);
        return answer;
    }
}
