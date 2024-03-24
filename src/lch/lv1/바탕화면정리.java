package lch.lv1;

import java.util.Arrays;

/**
 * 100/100
 */
public class 바탕화면정리 {
    public static void main(String[] args) {
        String[] wallpaper = {"..........", ".....#....", "......##..", "...##.....", "....#....."};
        System.out.println(solution(wallpaper));
    }

    private static int[] solution(String[] wallpaper) {

        int[] answer = new int[4];

        String[][] map = new String[wallpaper.length][wallpaper[0].length()];
        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[i].length(); j++) {
                map[i][j] = String.valueOf(wallpaper[i].charAt(j));
            }
        }

        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;

        int maxX = Integer.MIN_VALUE;
        int maxY = Integer.MIN_VALUE;


        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if(map[i][j].equals("#")){
                    minX = Math.min(minX,i);
                    minY = Math.min(minY,j);
                    maxX = Math.max(maxX,i);
                    maxY = Math.max(maxY,j);
                }
            }
        }

        answer[0] = minX;
        answer[1] = minY;
        answer[2] = maxX+1;
        answer[3] = maxY+1;

        return answer;
    }
}