package lch.kongQuestion;

import java.util.Arrays;

public class 돌의무게 {
    public static void main(String[] args) {
        int w = 2;
        int f = 5;
        System.out.println(solution(w,f));
    }

    private static int solution(int w, int f) {
        int answer = 0;
        double start = w * f;

        while (true){
            if(start<2) break;
            start = start / 3.0;
            answer++;
        }

        String.valueOf()







        return answer;
    }
}
