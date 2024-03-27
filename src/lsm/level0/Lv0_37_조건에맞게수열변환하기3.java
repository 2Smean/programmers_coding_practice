package lsm.level0;

import java.util.Arrays;

public class Lv0_37_조건에맞게수열변환하기3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int k = 3;
        System.out.println(Arrays.toString(solution(arr,k)));
    }
    private static int[] solution(int[] arr, int k) {
        int[] answer = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(k % 2 == 0){//짝수
                answer[i] = arr[i]+k;
            }else{
                answer[i] = arr[i]*k;
            }
        }
        return answer;
    }
}
