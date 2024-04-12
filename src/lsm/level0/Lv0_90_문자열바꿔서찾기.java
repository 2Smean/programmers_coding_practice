package lsm.level0;

public class Lv0_90_문자열바꿔서찾기 {
    public static void main(String[] args) {
        String str = "AABBBBA";
        String pat = "BBAA";
        System.out.println(solution(str,pat));
    }
    private static int solution(String str, String pat) {
        StringBuilder reversePat = new StringBuilder();
        int answer = 0;

        for(int i=0;i<pat.length();i++){
            char ch = pat.charAt(i);
            if(ch == 'A'){
                reversePat.append('B');
            }else if(ch == 'B'){
                reversePat.append('A');
            }
        }

        for(int i=0;i<str.length();i++){
            if(str.contains(reversePat)){
                return 1;
            }
        }
        return answer;
    }
}
