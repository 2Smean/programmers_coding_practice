package lsm.level0;

import java.util.ArrayList;
import java.util.List;
/*다시풀기*/
public class Lv0_60_배열에서문자열대소문자변환하기 {
    public static void main(String[] args) {

    }
    public String[] solution(String[] strArr) {
        List<String> answerList = new ArrayList<>();

        for(int i=0;i<strArr.length;i++){
            if(strArr.length % 2 == 1){//홀수일때
                answerList.add(String.valueOf(Character.toUpperCase(Integer.parseInt(strArr[i]))));
            }else{
                answerList.add(String.valueOf(Character.toLowerCase(Integer.parseInt(strArr[i]))));
            }
        }

        String[] answer = new String[answerList.size()];
        answer = answerList.toArray(answer);
        return answer;
    }
}
