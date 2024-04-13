package lsm.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lv0_92_배열의원소만큼추가하기 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(Arrays.toString(solution(arr)));
    }
    private static int[] solution(int[] arr) {
        List<Integer> answerList = new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            int a = arr[i];
            if(arr[i] == a){
                for(int j=0;j<arr[i];j++){
                    answerList.add(arr[i]);
                }
            }
        }

        int[] answer = new int[answerList.size()];
        for(int i=0;i<answerList.size();i++){
            answer[i] = answerList.get(i);
        }
        return answer;
    }
}
