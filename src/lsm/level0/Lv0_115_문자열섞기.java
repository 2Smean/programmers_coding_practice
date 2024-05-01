package lsm.level0;

public class Lv0_115_문자열섞기 {
    public static void main(String[] args) {
        String str1 = "aaaaaa";
        String str2 = "bbbbbb";
        System.out.println(solution(str1,str2));
    }
    private static String solution(String str1, String str2) {
        StringBuilder answer = new StringBuilder();

        for(int i=0;i<str1.length();i++){
            answer.append(str1.charAt(i));
            answer.append(str2.charAt(i));
        }
        return answer.toString();
    }
}
