package source_files.level0;

import java.util.Arrays;
/*배열은 주소값이 들어있기 때문에 단순히 출력하지 못한다
  Arrays.toString으로 묶어주거나 배열의 요소를 하나하나 출력하는 방법으로
  출력해야한다.
*/
public class Lv0_06아이스아메리카노 {
    public static void main(String[] args) {
        int money = 5500;
        System.out.println(Arrays.toString(solution(money)));
    }
    private static int[] solution(int money) {
        int[] answer = new int[2];
        int x=(money/5500);
        int y=(money%5500);
        answer[0]=x;
        answer[1]=y;

        return answer;
    }
}
