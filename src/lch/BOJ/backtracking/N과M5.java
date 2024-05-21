package lch.BOJ.backtracking;

import java.util.*;

public class N과M5 {

    private static int[] copyArr;
    private static List<String> list;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();


        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        list = new ArrayList<>();
        copyArr = arr;

    }
}


/**
 *
 * 4 2
 * 9 8 7 1
 * 1 7
 * 1 8
 * 1 9
 * 7 1
 * 7 8
 * 7 9
 * 8 1
 * 8 7
 * 8 9
 * 9 1
 * 9 7
 * 9 8
 */