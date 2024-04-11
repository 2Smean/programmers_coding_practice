package lsm.level0;

public class Lv0_86_부분문자열 {
    public static void main(String[] args) {
        String str1 = "ab";
        String str2 = "able";
        System.out.println(solution(str1,str2));
    }
    private static int solution(String str1, String str2) {
        int answer = 0;
        for(int i=0;i<str2.length();i++){
            if(str2.contains(str1)){
                return 1;
            }
        }
        return answer;
    }
}
