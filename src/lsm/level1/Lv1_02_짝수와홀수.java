package lsm.level1;
//정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하는 함수
public class Lv1_02_짝수와홀수 {
    private static String solution(int num) {
        if (num % 2 == 0) {
            return "Even";
        }else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        int num = 8;
        System.out.println(solution(num));
    }
}
