package lch.study.기출문제;

public class ex01 {
    public static void main(String[] args) {
        int[] arr = new int[5];


        for (int i = 1; i <= arr.length; i++) {
            arr[i-1] = arr.length-i+1;
        }

        // 5 4 3 2 1
        // 4 3 2 1 5

        for (int i = 0; i < 5; i++) {
            System.out.print( arr[(i+1)%5]+" ");
        }
    }
}
