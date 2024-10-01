package lsm.level1;

public class Lv1_29_시저암호 {

    private static String solution(String s, int n) {
        StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                result.append((char) ((c - 'A' + n) % 26 + 'A'));
            } else if (c >= 'a' && c <= 'z') { // 소문자일 경우
                result.append((char) ((c - 'a' + n) % 26 + 'a')); // 소문자 범위 내에서 순환
            } else {
                result.append(c); 
            }
        }

        return result.toString(); // 결과를 문자열로 반환
    }

    public static void main(String[] args) {
        System.out.println(solution("a B z", 4));
    }
}
