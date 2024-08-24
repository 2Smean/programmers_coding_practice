package lsm.level1;

public class Lv1_05_자릿수더하기 {

    private static int solution(int n) {
        int answer = 0;
        String stringN = String.valueOf(n);

        for (int i = 0; i < stringN.length(); i++) {
            char ch = stringN.charAt(i);
            answer += Integer.parseInt(String.valueOf(ch));
        }

        return answer;
    }

    public static void main(String[] args) {
        int n = 123;
        System.out.println(solution(n));
    }
}
