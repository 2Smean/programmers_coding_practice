package lch.jordy.priorityQueue;

import java.util.PriorityQueue;
import java.util.Scanner;

public class 카드합체놀이 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        PriorityQueue<Long> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            pq.offer(sc.nextLong());
        }

        for (int i = 0; i < m; i++) {
            Long firstCard = pq.poll();
            Long secondCard = pq.poll();

            Long newCard = firstCard + secondCard;
            pq.offer(newCard);
            pq.offer(newCard);
        }
        Long answer = 0L;
        for (Long i : pq) {
            answer += i;
        }
        System.out.println(answer);
    }
}


/*
3 1
3 2 6

4 2
4 2 3 1
 */