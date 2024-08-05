package lch.kongTest;

import java.util.Arrays;

public class jcgEx01 {
    public static void main(String[] args) {
        int[] arr = {2,1,3,4,5};
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
