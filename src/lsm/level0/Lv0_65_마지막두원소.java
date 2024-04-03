package lsm.level0;

import java.util.ArrayList;
import java.util.List;

public class Lv0_65_마지막두원소 {
    public static void main(String[] args) {

    }
    private static int[] solution(int[] list) {
        List<Integer> answerList = new ArrayList<>();

        for(int i=0;i<list.length;i++){
            answerList.add(list[i]);
        }
        if(list[list.length - 1] > list[list.length -2]){
            answerList.add(list[list.length -1] - list[list.length -2]);
        }else{
            answerList.add(list[list.length -1 ]*2);
        }

        int[] answer = new int[answerList.size()];
        for(int i=0;i<answerList.size();i++){
            answer[i] = answerList.get(i);
        }
        return answer;
    }
}
