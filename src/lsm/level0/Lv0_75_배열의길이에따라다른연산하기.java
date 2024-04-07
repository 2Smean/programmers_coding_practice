package lsm.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lv0_75_배열의길이에따라다른연산하기 {
    public static void main(String[] args) {
        int[] arr = {49, 12, 100, 276, 33};
        int n = 100;
        System.out.println(Arrays.toString(solution(arr,n)));
    }
    private static int[] solution(int[] arr, int n) {
        List<Integer> answerList = new ArrayList<>();
        int arrLength = arr.length;
        if(arrLength % 2 != 0){
            for(int i=0;i<arr.length;i++){
                if(arr[i] % 2 == 0){
                    answerList.add(arr[i]+n);
                }
            }
        }else{
            for(int i=0;i<arr.length;i++){
                if(arr[i] % 2 != 0){
                    answerList.add(arr[i]+n);
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
