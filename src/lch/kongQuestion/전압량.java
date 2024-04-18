package lch.kongQuestion;

import java.util.Arrays;

public class 전압량 {
    public static void main(String[] args) {

        int v = 4; // a에 가해진 전압
        int r = 3;  // a와 b를 연결하는 경로의 저항

        System.out.println(solution(v,r));
    }

    public static int[] solution(int v, int r) {
        int[] answer = new int[2];

        int gcd = gcd(v, r);

        answer[0] = v/gcd;
        answer[1] = r/gcd;

        return answer;
    }
    
    
    // 최대공약수 로직
    private static int gcd(int v, int r) {
        while (r!=0){
            int temp = r;
            r = v%r;
            v = temp;
        }
        return v;
    }
}
