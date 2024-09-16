package lsm.level1;

public class Lv1_19_문자열다루기기본 {

    private static boolean solution(String s) {
        // 문자열의 길이가 4 또는 6이 아니면 바로 false 반환
        if (s.length() != 4 && s.length() != 6) {
            return false;
        }

        // 문자열이 숫자로만 구성되어 있는지 확인
        for (int i = 0; i < s.length(); i++) {
            // 문자가 숫자가 아니면 false 반환
            if (!Character.isDigit(s.charAt(i))) {
                return false;
            }
        }

        // 위 조건을 모두 만족하면 true 반환
        return true;
    }

    public static void main(String[] args) {
        System.out.println(solution("1234"));  // true
    }
}
