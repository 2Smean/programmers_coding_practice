package lsm.level0;

public class Lv0_74_부분문자열 {
    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "ab";
        System.out.println(solution(str1,str2));
    }
    private static int solution(String str1, String str2) {
        int answer = 0;
        for(int i=0;i<str2.length();i++){
            for(int j=0;j<str1.length();j++){
                if (str1.charAt(i) == str2.charAt(i)) {
                    return 1;
                }
            }
        }
        return answer;
    }
}
