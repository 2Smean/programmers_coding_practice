package lsm.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lv0_31_짝수는싫어요 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Arrays.toString(solution(n)));
    }
    private static int[] solution(int n) {
        List<Integer> array = new ArrayList<>();

        for(int i=1;i<=n;i++){
            if(i%2 == 1){
                array.add(i);
            }

        }
        int[] answer = new int[array.size()];
        for(int i=0;i<array.size();i++){
            answer[i] = array.get(i);
        }
        return answer;
    }
}
