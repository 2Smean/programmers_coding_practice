package lch.lv2;

import java.util.ArrayDeque;
import java.util.Arrays;

public class 게임맵최단거리 {
    private static int[] dx = {1,0,-1,0};
    private static int[] dy = {0,1,0,-1};
    public static void main(String[] args) {
        int[][] maps = {{1,0,1,1,1},
                        {1,0,1,0,1},
                        {1,0,1,1,1},
                        {1,1,1,0,1},
                        {0,0,0,0,1}};
        System.out.println(solution(maps));
    }


    private static class Node {
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private static int solution(int[][] maps) {


        ArrayDeque<Node> deque = new ArrayDeque<>();
        deque.addLast(new Node(0,0));
        int[][] map = new int[maps.length][maps[0].length];


        for (int i = 0; i < maps.length; i++) {
            for (int j = 0; j < maps.length; j++) {
                
            }
        }
        return 0;
    }
}
