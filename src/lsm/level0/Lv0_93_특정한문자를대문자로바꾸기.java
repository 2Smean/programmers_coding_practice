package lsm.level0;
/*alp 가 하나였기 떄문에 가능한 코드 예외도 생각해서 풀어보자*/
public class Lv0_93_특정한문자를대문자로바꾸기 {
    public static void main(String[] args) {
        String str = "adsf";
        String alp = "a";
        System.out.println(solution(str,alp));
    }
    private static String solution(String str, String alp) {
        StringBuilder answer = new StringBuilder();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == alp.charAt(0)){
                answer.append(Character.toUpperCase(ch));
            }else{
                answer.append(ch);
            }
        }
        return answer.toString();
    }
}
