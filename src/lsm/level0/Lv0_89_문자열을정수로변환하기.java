package lsm.level0;

public class Lv0_89_문자열을정수로변환하기 {
    public static void main(String[] args) {
        String str = "123";
        System.out.println(solution(str));
    }
    private static int solution(String str) {
        int answer = Integer.parseInt(str);
        return answer;
    }
}
