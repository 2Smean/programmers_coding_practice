package lch.study.jcg4;

import java.util.Arrays;

public class Ex08 {
    public static void main(String[] args) {
        int[] arr = {0,0,0,0,3};

        for (int i = 4;  i >=0 ; i--) {
            System.out.println("arr[i] = " + arr[i]);
            for (int j = 4; j >i ; j--) {
                System.out.print(arr[j] + " ");
                arr[i] += arr[j];
            }
            System.out.println();
        }

        System.out.println(Arrays.toString(arr));
    }
}
