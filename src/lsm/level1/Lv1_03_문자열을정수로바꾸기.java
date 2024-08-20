package lsm.level1;

public class Lv1_03_문자열을정수로바꾸기 {

    private static int solution(String s) {
        int numS = Integer.parseInt(s);
        if (numS > 0) {
            return numS;
        } else {
            return numS;
        }
    }

    public static void main(String[] args) {
        String s = "-1234";
        System.out.println(solution(s));
    }
}
