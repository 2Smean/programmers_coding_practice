package lsm.level0;

public class Lv0_39_문자열앞의n글자 {
    public static void main(String[] args) {
        String str = "asifjsdfisd4j32fi2j";
        int n = 8;
        System.out.println(solution(str,n));
    }
    private static String solution(String str, int n) {
        StringBuilder answer = new StringBuilder();

        for(int i=0;i<n;i++){
            answer.append(str.charAt(i));
        }
        return answer.toString();
    }
}
