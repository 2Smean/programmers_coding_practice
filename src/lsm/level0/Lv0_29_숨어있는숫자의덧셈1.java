package lsm.level0;
/*char 를 int 로 형변환하는 방법은 Character.getNumericValue() 를 이용해서 형변환해준다*/
public class Lv0_29_숨어있는숫자의덧셈1 {
    public static void main(String[] args) {
        String str = "a8s7e6k3";
        System.out.println(solution(str));
    }
    private static int solution(String str) {
        int answer = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '1' && ch <= '9') {
                answer += Character.getNumericValue(ch);
            }
        }
        return answer;
    }
}
