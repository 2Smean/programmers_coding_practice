package lch.jordy.sort;

import java.util.Arrays;
import java.util.Comparator;

public class 정렬1 {
    public static void main(String[] args) {
        int[][] map = {{3,4},
                        {4,5},
                        {2,3},
                        {2,4}};

        for (int[] ints : map) {
            System.out.println(Arrays.toString(ints));
        }


        System.out.println("-----------------------------");

        Arrays.sort(map, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[0] - o1[0];
            }
        });

        for (int[] ints : map) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
