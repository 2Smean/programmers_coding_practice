package lch.lv1;

import java.util.Arrays;

public class 공원산책 {
    public static void main(String[] args) {
        String[] park ={"SOO","OOO","OOO"};
        String[] routes = {"E 2","S 2","W 1"};
        System.out.println(solution(park,routes));
    }

    private static int[] solution(String[] park, String[] routes) {
        String[][] maps = new String[park.length][park[0].length()];

        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length(); j++) {
                maps[i][j] = String.valueOf(park[i].charAt(j));
            }
        }

        
        return new int[0];
    }
}
