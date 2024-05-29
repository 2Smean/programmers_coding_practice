package lsm.level0;

public class Lv0_121_중복된문자제거 {
    public static void main(String[] args) {
        String str = "We other world";
        System.out.println(solution(str));
    }
    private static String solution(String str) {
        StringBuilder answer = new StringBuilder();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if (answer.indexOf(String.valueOf(ch)) == -1) {
                answer.append(ch);
            }
        }

        return answer.toString();
    }
}
