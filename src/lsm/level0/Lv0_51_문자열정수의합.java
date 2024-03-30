package lsm.level0;
/*문자열을 정수로 바꿀 때 Integer.parseInt 를 이용하거나
* Integer.valueOf 를 사용해서 변환*/
public class Lv0_51_문자열정수의합 {
    public static void main(String[] args) {
        String num = "15234523";
        System.out.println(solution(num));
    }
    private static int solution(String num) {
        int answer = 0;
        for(int i=0;i<num.length();i++){
            char ch = num.charAt(i);
            int idx = Integer.parseInt(String.valueOf(ch));
            answer = answer + idx;
        }
        return answer;
    }
}
