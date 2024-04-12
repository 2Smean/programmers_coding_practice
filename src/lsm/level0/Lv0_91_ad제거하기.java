package lsm.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lv0_91_ad제거하기 {
    public static void main(String[] args) {
        String[] strArr = {"adadf", "rels", "feij"};
        System.out.println(Arrays.toString(solution(strArr)));
    }
    private static String[] solution(String[] strArr) {
        List<String> answerList = new ArrayList<>();
        String ad = "ad";

        for(int i=0;i<strArr.length;i++){
            if(!strArr[i].contains(ad)){
                answerList.add(strArr[i]);
            }
        }

        String[] answer = new String[answerList.size()];
        answer = answerList.toArray(answer);

        return answer;
    }
}
