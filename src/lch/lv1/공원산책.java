package lch.lv1;

import java.util.ArrayDeque;
import java.util.Arrays;

public class 공원산책 {
    public static void main(String[] args) {
        String[] park ={"SOO","OOO","OOO"};
        String[] routes = {"E 2","S 2","W 1"};
        System.out.println(solution(park,routes));
    }

    private static class Node{
        int x;
        int y;
        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private static int[] solution(String[] park, String[] routes) {
        String[][] maps = new String[park.length][park[0].length()];


        ArrayDeque<Node> deque = new ArrayDeque<>();

        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length(); j++) {
                maps[i][j] = String.valueOf(park[i].charAt(j));
                if(maps[i][j].equals("S")){
                    deque.addLast(new Node(i,j));
                }
            }
        }

        for (int i = 0; i < routes.length; i++) {
            String direction = String.valueOf(routes[i].charAt(0));
            int moving = Integer.parseInt(String.valueOf(routes[i].charAt(2)));

            int dx = 0;
            int dy = 0;
            if(direction.equals("E")){ // 동
                dy = moving;
            }
            else if(direction.equals("W")){ // 서
                dy = -moving;
            }
            else if(direction.equals("S")){ // 남
                dx = moving;
            }
            else if(direction.equals("N")){ // 북
                dx = -moving;
            }

            while (!deque.isEmpty()){
                Node now = deque.pollFirst();
                int nx = now.x + dx;
                int ny = now.y + dy;

                if(ny<0 || nx<0 || nx>=maps.length || ny>= maps[0].length || maps[nx][ny].equals("X")) {

                    break;
                }
                else {
                    System.out.println("nx = " + nx);
                    System.out.println("ny = " + ny);
                    maps[now.x][now.y] = "O";
                    maps[nx][ny] = "S";
                    deque.addLast(new Node(nx, ny));
                }
            }
        }

        for (int i = 0; i < maps.length; i++) {
            System.out.println(Arrays.toString(maps[i]));
        }

        return new int[0];
    }
}
