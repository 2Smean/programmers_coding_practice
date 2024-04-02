package lch.lv2;

import java.util.PriorityQueue;

public class 더맵게 {
    public static void main(String[] args) {

        int[] scoville = {1, 2, 3, 9, 10, 12};
        int k = 7;
        System.out.println(solution(scoville,k));
    }

    private static int solution(int[] scoville, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int scoop : scoville) {
            pq.add(scoop);
        }

        int ans = 0;

        while (true){
            if(pq.peek() >= k) {
                return ans;
            }
            else {
                int firstNum = pq.poll();
                int secondNum = pq.poll();
                pq.add(firstNum +(secondNum * 2));
                ans++;
            }
        }

    }
}
