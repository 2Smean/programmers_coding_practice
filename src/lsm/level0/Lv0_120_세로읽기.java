package lsm.level0;

public class Lv0_120_세로읽기 {
    public static void main(String[] args) {
        String str = "ihrhbakrfpndopljhygc";
        int m = 4;
        int c = 2;
        System.out.println(solution(str,m,c));
    }
    private static String solution(String str, int m, int c) {
        StringBuilder answer = new StringBuilder();

        for(int i=c-1;i<str.length();i+=m){
            char ch = str.charAt(i);
            answer.append(ch);
        }

        return answer.toString();
    }
}
