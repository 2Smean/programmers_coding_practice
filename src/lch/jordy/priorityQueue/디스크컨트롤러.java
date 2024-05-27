package lch.jordy.priorityQueue;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 프로그래머스 LV.3
 * 문제이름 : 디스크 컨트롤러
 */
public class 디스크컨트롤러 {
    public static void main(String[] args) {
        int[][] jobs = {{0,3},
                        {1,9},
                        {2,6}};
        System.out.println(solution(jobs));
    }

    private static int solution(int[][] jobs) {
        int answer = 0;
        Arrays.sort(jobs, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        return answer;
    }
}


/**
 * [[0, 3], [1, 9], [2, 6]]	9
 */