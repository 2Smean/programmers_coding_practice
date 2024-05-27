package lch.BOJ.backtracking;

import java.util.Arrays;
import java.util.Scanner;

public class N과M4 {

    private static int[] copyMap;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] arr = new int[N];
        for (int i = 1; i <= arr.length; i++) {
            arr[i-1] = i;
        }
        copyMap = arr;

        dfs(M,0,"",0);
    }
    private static void dfs(int m, int depth, String str,int now){
        if(depth == m){
            System.out.println(str.trim());
            return;
        }

        for (int i = now; i < copyMap.length; i++) {
            dfs(m,depth+1, str + copyMap[i] +" ",i);
        }
    }
}

/**
 * 1 1
 * 1 2
 * 1 3
 * 1 4
 * 2 2
 * 2 3
 * 2 4
 * 3 3
 * 3 4
 * 4 4
 */