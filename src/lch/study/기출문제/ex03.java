package lch.study.기출문제;

import java.util.Arrays;

public class ex03 {
    public static void main(String[] args) {
        int arr[] = {85,75,50,100,95};
        System.out.println(solution(arr));
    }

    private static int solution(int[] arr) {

        align(arr);

        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

        return 0;
    }

    private static void align(int[] arr) {

        int temp = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
