package lch.lv2;

import java.util.ArrayDeque;
import java.util.Arrays;

public class 게임맵최단거리 {

    private static int[][] copyMap;
    private static boolean[][] visitied;
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

        copyMap = maps;
        visitied = new boolean[maps.length][maps[0].length];

        ArrayDeque<Node> deque = new ArrayDeque<>();
        deque.addLast(new Node(0,0));
        visitied[0][0] = true;

        while (!deque.isEmpty()){
            Node now = deque.pollFirst();
            for (int i = 0; i < 4; i++) {
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];

                if(nx<0 || ny<0 || nx>= maps.length || ny >= maps.length){
                    continue;
                }
                if(visitied[nx][ny]){
                    continue;
                }
                if(!visitied[nx][ny] && copyMap[nx][ny] != 0) {
                    visitied[nx][ny] = true;
                    copyMap[nx][ny] = copyMap[now.x][now.y] + 1;
                    deque.addLast(new Node(nx, ny));
                }
            }
        }

        int ans = copyMap[maps.length-1][maps[0].length-1];
        return (visitied[maps.length-1][maps[0].length-1]) ? ans : -1 ;
    }
}
