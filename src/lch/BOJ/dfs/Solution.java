package lch.BOJ.dfs;

import java.util.Arrays;
import java.util.HashSet;

public class Solution {

    private static boolean[] visited;
    private static HashSet<String> set;
    public static void main(String[] args) {
        visited = new boolean[4];
        set = new HashSet<>();
        dfs(0,"");

    }

    private static void dfs(int depth, String str) {
        System.out.println(Arrays.toString(visited));
        System.out.println(str);
        if(str.length() == 3){
            set.add(str);
            return;
        }
        for (int i = 1; i <= 3; i++) {
            if(!visited[i-1]){
                visited[i-1] = true;
                dfs(depth+1,str + i);
                visited[i-1] = false;
            }
        }
    }
}
