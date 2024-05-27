package lch.BOJ.backtracking;

import java.util.Scanner;

/**
 *
 */
public class N과M2 {
    private static boolean[] visited;
    private static int[] copyMap;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        visited = new boolean[N];
        int[] map = new int[N];

        for (int i = 1; i <= N; i++) {
            map[i-1] = i;
        }

        copyMap = map;

        dfs(M,0, "",0);

    }

    private static void dfs(int m, int depth,String str,int now) {
        if(depth == m){
            System.out.println(str.trim());
            return;
        }
        for (int i = now; i < copyMap.length; i++) {
            if(!visited[i]) {
                visited[i] = true;
                dfs(m, depth + 1, str + copyMap[i] + " ",i+1);
                visited[i] = false;
            }
        }
    }
}
