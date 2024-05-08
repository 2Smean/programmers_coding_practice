package lch.jordy.priorityQueue;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class 강의실배정2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] map = new int[N][2];

        for(int i = 0; i < N; i++){
            for (int j = 0; j < 2; j++) {
                map[i][j] = sc.nextInt();
            }
        }
        Arrays.sort(map, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0]) return o1[1] - o2[1];
                return o1[0]-o2[0];
            }
        });

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(map[0][1]);
        for(int i=1; i<map.length; i++){
            System.out.println("pq = " + pq);
            if(map[i][0] <= pq.peek()) pq.poll();

            pq.add(map[i][1]);
        }

        System.out.println(pq.size());

    }
}
