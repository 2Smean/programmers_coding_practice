package lsm.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lv0_52_조건에맞게수열변경하기1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 50, 100, 150, 3};
        System.out.println(Arrays.toString(solution(arr)));
    }
    private static int[] solution(int[] arr) {
        List<Integer> answerList = new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            if(arr[i]>=50 && arr[i] % 2 == 0){
                answerList.add(arr[i]/2);
            }else if(arr[i]<50 && arr[i] % 2 == 1){
                answerList.add(arr[i]*2);
            }else{
                answerList.add(arr[i]);
            }
        }

        int[] answer = new int [answerList.size()];
        for(int i=0;i<answerList.size();i++){
            answer[i] = answerList.get(i);
        }
        return answer;
    }
}
