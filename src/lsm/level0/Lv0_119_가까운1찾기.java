package lsm.level0;

import java.util.Arrays;

public class Lv0_119_가까운1찾기 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 0};
        int idx = 3;
        System.out.println(solution(arr,idx));
    }
    private static int solution(int[] arr, int idx) {

        for(int i=idx;i<arr.length;i++){
            if(arr[i] == 1){
                return i;
            }
        }
        return -1;
    }
}
