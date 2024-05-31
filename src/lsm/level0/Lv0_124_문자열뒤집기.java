package lsm.level0;

public class Lv0_124_문자열뒤집기 {
    public static void main(String[] args) {
        String str = "Progra21Sremm3";
        int s = 6;
        int e = 12;
        System.out.println(solution(str,s,e));
    }
    private static String solution(String str, int s, int e) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < s; i++) {
            answer.append(str.charAt(i));
        }

        for (int i = e; i >= s; i--) {
            answer.append(str.charAt(i));
        }

        for (int i = e + 1; i < str.length(); i++) {
            answer.append(str.charAt(i));
        }
        return answer.toString();
    }
}
