package lch.lv2;
import java.util.Collections;
import java.util.PriorityQueue;
public class 프로세스 {
    public static void main(String[] args) {
        int[] priorities = {2,3,3,2};
        int location = 2;
        System.out.println(solution(priorities,location));
    }

    private static int solution(int[] priorities, int location) {
        int ans = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int priority : priorities) {
            pq.add(priority);
        }


        while (!pq.isEmpty()){
            for (int i = 0; i < priorities.length; i++) {
                if(pq.peek() == priorities[i]){
                    pq.poll();
                    ans ++;

                    if(location == i){
                        return ans;
                    }
                }
            }
        }
        return ans;
    }
}
