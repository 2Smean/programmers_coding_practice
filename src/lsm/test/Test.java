package lsm.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        String[] strArr = {"adadf", "rels", "feij"};
        System.out.println(Arrays.toString(solution(strArr)));
    }
    private static String[] solution(String[] strArr) {
        List<String> answerList = new ArrayList<>();
        String str = Arrays.toString(strArr);
        System.out.println("여기"+str);
        for(int i=0;i<strArr.length;i++){

            if(strArr[i] != "ad"){
                answerList.add(strArr[i]);
            }
        }

        String[] answer = new String[answerList.size()];
        answer = answerList.toArray(answer);

        return answer;
    }
}
