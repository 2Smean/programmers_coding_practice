package lch.jordy.priorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class 디펜스게임2 {
    public static void main(String[] args) {
        int n = 7;
        int k = 3;
        int[] enemy = {4, 2, 4, 5, 3, 3, 1};
        System.out.println(solution(n,k,enemy));
    }

    private static int solution(int n, int k, int[] enemy) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        int answer = 0;
        for(int i = 0; i<enemy.length; i++){
            System.out.println("n = " + n);
            pq.add(enemy[i]);
            if(n>= enemy[i]){
                n-=enemy[i];
            }
            else {
                if(k>0){
                    n += pq.poll();
                    k--;
                }
            }
            if(n<0)
                break;
            answer++;
        }

        return answer;
    }
}