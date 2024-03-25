package lsm.level0;
/*정수인 int n 을 문자열로 변경하기 위해서 String.valueOf 를 사용하여 변경하고
  str.charAt으로 요소들을 뽑아내고 String.valueOf로 문자열로 변경 후 Integer.parseInt 로 숫자로 변경*/
public class Lv0_18_자릿수더하기 {
    public static void main(String[] args) {
        int n = 1345;
        System.out.println(solution(n));
    }
    private static int solution(int n) {
        int answer = 0;
        String str = String.valueOf(n);
        for(int i=0;i < str.length(); i++){
            answer += Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        return answer;
    }
}
