package lsm.level0;

public class Lv0_45_대문자와소문자 {
    public static void main(String[] args) {
        String my_string = "anDEndedD";
        System.out.println(solution(my_string));
    }
    private static String solution(String my_string) {
        StringBuilder answer = new StringBuilder();

        for(int i=0;i<my_string.length();i++){
            char ch = my_string.charAt(i);
            if(Character.isLowerCase(ch)){
                answer.append(Character.toUpperCase(ch));
            }else if(Character.isUpperCase(ch)){
                answer.append(Character.toLowerCase(ch));
            }
        }
        return answer.toString();
    }
}
