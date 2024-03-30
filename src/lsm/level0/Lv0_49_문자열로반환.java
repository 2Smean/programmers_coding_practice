package lsm.level0;

public class Lv0_49_문자열로반환 {
    public static void main(String[] args) {
        int n = 1234;
        System.out.println(solution(n));
    }
    private static String solution(int n) {
        String answer = "";
        for(int i=0;i<n;i++){
            answer = String.valueOf(n);
        }
        return answer;
    }
}
