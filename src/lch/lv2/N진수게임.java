package lch.lv2;

public class N진수게임 {
    public static void main(String[] args) {
        // 진법
        int n = 2;
        // 구할 숫자의 갯수
        int t = 4;
        // 게임에 참가하는 인원
        int m = 2;
        // 튜브의 순서
        int p = 1;
        System.out.println(solution(n,t,m,p));
    }

    private static String solution(int n, int t, int m, int p) {
        String answer = "";
        int i = 0;
        int totalRound = t * m;
        String ans = "";
        int cnt = 0;

        while (answer.length()<=totalRound){
            answer += Integer.toString(i++,n);
        }


        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < answer.length(); j++) {
            if(sb.length() == t) return  sb.toString();
            if((j%m) + 1 == p){
                sb.append(String.valueOf(answer.charAt(j)).toUpperCase());
            }
        }

        return sb.toString();
    }
}
