package lsm.level0;

public class Lv0_108_i로만들기 {
    public static void main(String[] args) {
        String str = "abcdevwxyz";
        System.out.println(solution(str));
    }
    private static String solution(String str) {
        StringBuilder answer = new StringBuilder();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch < 'l'){
                answer.append('l');
            }else{
                answer.append(ch);
            }
        }
        return answer.toString();
    }
}
