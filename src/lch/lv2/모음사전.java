package lch.lv2;

import java.util.HashMap;

public class 모음사전 {

    private static String[] copyDic;
    private static HashMap<String,Integer> map;
    private static int count;
    public static void main(String[] args) {
        String word = "AAAAE";
        System.out.println(solution(word));
    }

    private static int solution(String word) {
        int answer = 0;

        map = new HashMap<>();
        String[] dictionary = {"A","E","I","O","U"};
        copyDic = dictionary;
        dfs("",0);


        return map.get(word);
    }

    private static void dfs(String s,int cnt) {
        map.put(s,count);
        count++;
        if(cnt == copyDic.length) {
            return;
        }
        for (int i = 0; i < copyDic.length; i++) {
            dfs(s + copyDic[i],cnt+1);
        }
    }
}
