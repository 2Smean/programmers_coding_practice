package lsm.level1;

public class Lv1_14_가운데글자가져오기 {

    private static String solution(String s) {
        int length = s.length();  // 문자열 길이

        // 홀수인 경우 가운데 한 글자 반환
        if (length % 2 == 1) {
            return s.substring(length / 2, length / 2 + 1);
        }

        // 짝수인 경우 가운데 두 글자 반환
        return s.substring(length / 2 - 1, length / 2 + 1);
    }

    public static void main(String[] args) {
        String s = "abcde";
        System.out.println(solution(s));  // "c"
    }
}
