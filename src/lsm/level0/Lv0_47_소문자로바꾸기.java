package lsm.level0;

public class Lv0_47_소문자로바꾸기 {
    public static void main(String[] args) {
        String str = "ansDFEansdEEEE";
        System.out.println(solution(str));
    }
    private static String solution(String str) {
        StringBuilder answer = new StringBuilder();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)){
                answer.append(Character.toLowerCase(ch));
            }else{
                answer.append(ch);
            }
        }
        return answer.toString();
    }
}
