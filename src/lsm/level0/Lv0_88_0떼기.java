package lsm.level0;
/*0이 아닌 문자열을 만난 이후의 0을 제거하면 안되는데 방법을 모르겠다...*/
public class Lv0_88_0떼기 {
    public static void main(String[] args) {
        String str = "0010";
        System.out.println(solution(str));
    }
    private static String solution(String str) {
        StringBuilder answer = new StringBuilder();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == '0'){
                continue;
            }else{
                answer.append(ch);
            }
        }
        return answer.toString();
    }
}
